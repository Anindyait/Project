package pkg;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Search
 */
@WebServlet("/Search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Search() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	String sort = null;
	String param = "";


    //HTML template for each Product Card
    //Note everything that is put from the DBMS is in the form !<NAME_IN_CAPS>! form,
    //this is just a protocol I followed, pls follow this gaiss. 
    String productCardTemplate = "<div class=\"col list-padding\" data-sizes=\",!SIZES!,\" data-genders=\",!GENDERS!,\" data-price=\"!PRICE!\" data-pid=\"!P_ID!\">\r\n"
			+ "                <a href=\"Product?pid=!P_ID!&category=!CAT!\" class=\"product-link\" data-toggle=\"tooltip\" title=\"!PRODUCT_NAME!\">\r\n"
			+ "                    <div class=\"product\">\r\n"
			+ "                        <img src=\"Pics/!IMAGE!.jpg\" class=\"card-img-top round\" alt=\"...\">\r\n"
			+ "                        <div class=\"card-body\">\r\n"
			+ "                                <h5 class=\" list-title\">!PRODUCT_NAME!</h5>\r\n"
			+ "                                <p class=\"card-text list-price\">&#8377;!PRICE!<sup>.00</sup></p>\r\n"
			+ "                            </div>\r\n"
			+ "                    </div>\r\n"
			+ "                </a>\r\n"
			+ "            </div>"
			+ "					";
    
    
    //Will have all the Cards, can't be null.
    String allProductCards;
    
    String query = "select product_id, p_name, price, imgs, sizes, cat1 from product_table where cat3 like(?) or cat2 like(?) or cat1 like(?) or p_name like(?) or descr like(?) order by product_id desc";
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		
		ServletContext context=getServletContext();
		
		String searchSt = request.getParameter("search-text");
		String searchString = Utilities.LikeString(searchSt);
		System.out.println(searchString);
		
		allProductCards = " ";
    	try {
    		Connection con;
    		PreparedStatement pstm;
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet", "root", "abcd"); //DriverManager is a class 
			pstm = null;
					
			pstm = con.prepareStatement(query);
			pstm.setString(1, searchString);
			pstm.setString(2, searchString);
			pstm.setString(3, searchString);
			pstm.setString(4, searchString);
			pstm.setString(5, searchString);
			
			ResultSet rs = pstm.executeQuery();
			
			
			
			while(rs.next())
			{
				
				//Splitting the image address.
				String[] image = rs.getString("imgs").split(",");
				
				//Getting price in String with the intent of remove dat ugly ".0".
				String price = rs.getString("price");
				
				//Each Card String.
				String eachProductCard = productCardTemplate;
				
				//putting the data in the template.
				eachProductCard = eachProductCard.replaceAll("!PRICE!", price.substring(0, price.length() - 2));
				
				eachProductCard = eachProductCard.replaceAll("!PRODUCT_NAME!", rs.getString("p_name"));
				
				eachProductCard = eachProductCard.replaceAll("!IMAGE!", image[0]);
				
				eachProductCard = eachProductCard.replaceAll("!P_ID!", rs.getString("product_id"));
				
				eachProductCard = eachProductCard.replaceAll("!SIZES!", rs.getString("sizes"));
				
				eachProductCard = eachProductCard.replaceAll("!GENDERS!", rs.getString("cat1"));
				
				eachProductCard = eachProductCard.replaceAll("!CAT!", searchSt);


				//concat each card.
				allProductCards = allProductCards.concat(eachProductCard);

			}
			
			//putting the Cards in productList.jsp.
			

			request.setAttribute("product_cards", allProductCards);
			request.setAttribute("category_name", searchSt.replaceAll(",", ""));
			request.setAttribute("param", param);
			
			System.out.println("Param before sending = "+param);

			
			request.getRequestDispatcher("productList.jsp").forward(request, response);
			
			
			
    	}catch(Exception e) {System.out.println(e);}
    	
    	
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		
		ServletContext context=getServletContext();
		
		String searchString = request.getParameter("search");
		searchString = Utilities.LikeString(searchString);
		
		System.out.println("Post "+ searchString);
		
		String suggestionTemplate = "<a href=\"Product?pid=!PID!&category=New Arrivals\">!SUGGESTION!</a>";

		
		String suggestions = " ";
		
		try {
			Connection con;
    		PreparedStatement pstm;
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet", "root", "abcd"); //DriverManager is a class 
			
			pstm = con.prepareStatement("select product_id, p_name from product_table where p_name like (?) order by product_id desc limit 10;");
    		
			pstm.setString(1, searchString);
			
			ResultSet rs = pstm.executeQuery();
			
			
			while(rs.next())
			{
				System.out.println(rs.getString("p_name"));
				
				
				String eachSuggestion = suggestionTemplate.replaceAll("!SUGGESTION!", rs.getString("p_name"));
				eachSuggestion = eachSuggestion.replaceAll("!PID!", rs.getString("product_id"));

				suggestions = suggestions.concat(eachSuggestion);
				
			}
			
			pw.println(suggestions);
			
		}catch(Exception e) {}
		
		
	}

}
