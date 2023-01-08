package pkg;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cart
 */
@WebServlet("/Cart")
public class Cart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cart() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    String cart_list = "";
    
    String cartItemTemplate = "<div class=\"Cart-Items\">\r\n"
    		+ "                                    <div class=\"row\">\r\n"
    		+ "                                        <div class=\"col\">\r\n"
    		+ "                                            <div class=\"image-box\">\r\n"
    		+ "                                                <img src=\"!IMGS!\" style= \"height: 120px\">\r\n"
    		+ "                                            </div>\r\n"
    		+ "                                        </div>                                        \r\n"
    		+ "                                    </div>\r\n"
    		+ "                                    \r\n"
    		+ "                                    <div class=\"about-cart\">\r\n"
    		+ "                                        <h1 style = \"font-size:21px\">!TITLE!</h1>\r\n"
    		+ "										   <p class=\"pid\" style=\"display:none;\">!PID!</p>"					
    		+ "                                        <h3 class=\"subtitle-cart\">Size: !SIZE!</h3>\r\n"
    		+ "                                    </div>                                   \r\n"
    		+ "                                    								\r\n"
    		+ "									<div class=\"col-md-3 col-lg-3 col-xl-2 d-flex\" >                                   \r\n"
    		+ "                                        <input id=\"form1\" min=\"1\" max = \"6\" name=\"quantity\" value=\"!QUANTITY!\" type=\"number\" onchange =\"calcTotal()\"\r\n"
    		+ "                                        class=\"form-control quant form-control-sm\"/>								\r\n"
    		+ "									</div>\r\n"
    		+ "                                    \r\n"
    		+ "                                    <div class =\"price\">!PRICE!</div>\r\n"
    		+ "                                    \r\n"
    		+ "                                    <div class=\"prices\">\r\n"
    		+ "                                        <div class=\"amount\">!AMT!</div>\r\n"
    		+ "                                        <div class=\"remove\">\r\n"
    		+ "                                            <button class =\"btn btn-danger\" id =\"Remove-Button\" \r\n"
    		+ "                                            onclick = \"RemovefromCart(this)\">Remove</button>\r\n"
    		+ "                                        </div>\r\n"
    		+ "                                    </div>\r\n"
    		+ "                                </div>"
    		+ "                                <br>";
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text");
		PrintWriter pw=response.getWriter();
		ServletContext context=getServletContext();
		
		String user_id = Utilities.GetUID(request);
		
		
		if(user_id == null)
		{
			request.getRequestDispatcher("Login").include(request, response);
		}
		// When a user wants to see their cart
		else
		{
			System.out.println("Cart page");
			cart_list = "";
			
			try {
				Connection con;
				PreparedStatement pstm;
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet", "root", "abcd"); //DriverManager is a class 
				
				pstm = con.prepareStatement("select imgs, p_name, size, quantity, price, cart_table.product_id "
						+ "from cart_table inner join product_table "
						+ "on cart_table.product_id = product_table.product_id where user_id = ? and order_id IS NULL;");
				// When order_id is null, those items are in the cart
				
				pstm.setString(1, user_id);
				
				ResultSet rs = pstm.executeQuery();
				
			    while (rs.next ())
			    {			    	
					String[] image = rs.getString("imgs").split(",");
					
					float amt = rs.getInt("quantity") * rs.getFloat("price");
					
			    	String eachProductOption = cartItemTemplate;
			    	eachProductOption = eachProductOption.replaceAll("!IMGS!", "Pics/" + image[0] + ".jpg" );
			    	eachProductOption = eachProductOption.replaceAll("!TITLE!",rs.getString ("p_name") );
			    	eachProductOption = eachProductOption.replaceAll("!SIZE!", rs.getString ("size"));
			    	eachProductOption = eachProductOption.replaceAll("!QUANTITY!", rs.getString ("quantity"));
			    	eachProductOption = eachProductOption.replaceAll("!PRICE!", rs.getString ("price"));
			    	eachProductOption = eachProductOption.replaceAll("!PID!", rs.getString ("cart_table.product_id"));
			    	eachProductOption = eachProductOption.replaceAll("!AMT!", String.valueOf(amt) );
	
			    	
			    	cart_list = cart_list.concat(eachProductOption);
			    }
			}catch(Exception e) {}

			request.setAttribute("cart_list", cart_list);
			request.getRequestDispatcher("cart.jsp").include(request, response);
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		
		ServletContext context=getServletContext();
		
		String user_id = Utilities.GetUID(request);
		
		String job = request.getParameter("job");
				
		if(user_id == null)
		{
			request.getRequestDispatcher("Login").include(request, response);
		}
		
		
		// When product.jsp sends a POST request for insertion to cart
		else if (job.equals("add"))
		{
			String pid = request.getParameter("pid");
			String size = request.getParameter("size");
			
			System.out.println("Post " + pid + " " + size);
			
			try {
				Connection con;
				PreparedStatement pstm;
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet", "root", "abcd"); //DriverManager is a class 

				pstm = con.prepareStatement(" update cart_table set quantity = quantity + 1 where user_id = ? and product_id = ? and size = ? and order_id IS NULL;");
				pstm.setString(1, user_id);
				pstm.setString(2, pid);
				pstm.setString(3, size);

				int rs = pstm.executeUpdate(); 
				
				if (rs == 0)
				{
					pstm = con.prepareStatement("insert into cart_table(user_id, product_id, quantity, size) values(?, ?, 1, ?);");
					
					
					pstm.setString(1, user_id);
					pstm.setString(2, pid);
					pstm.setString(3, size);
	
					rs = pstm.executeUpdate();
				}
				System.out.println("Successfully inserted into cart!");

			
	    	}catch(Exception e) {}
			
		}
		
		// When cart.jsp sends a POST request for change in quantity of product
		else if (job.equals("quantity"))
		{
			String pid = request.getParameter("pid");
			String qty = request.getParameter("qty");
			String size = request.getParameter("size");
			
			try {
				Connection con;
				PreparedStatement pstm;
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet", "root", "abcd"); //DriverManager is a class 

				pstm = con.prepareStatement("update cart_table set quantity = ? where user_id = ? and product_id = ? and size = ? and quantity != ? and order_id IS NULL;");

				pstm.setString(1, qty);
				pstm.setString(2, user_id);
				pstm.setString(3, pid);
				pstm.setString(4, size);
				pstm.setString(5, qty);

				int rs = pstm.executeUpdate(); 
			
	    	}catch(Exception e) {}

		}
		
		// When cart.jsp sends a POST request to remove items
		else if (job.equals("remove"))
		{
			String pid = request.getParameter("pid");
			String qty = request.getParameter("qty");
			String size = request.getParameter("size");
			
			try {
				Connection con;
				PreparedStatement pstm;
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet", "root", "abcd"); //DriverManager is a class 
				
				//Remove one item
				if (qty.equals("one"))
				{
					pstm = con.prepareStatement("delete from cart_table where user_id = ? and product_id = ? and size = ? and order_id IS NULL;");

					pstm.setString(1, user_id);
					pstm.setString(2, pid);
					pstm.setString(3, size);
					
					System.out.println(pstm);

					int rs = pstm.executeUpdate(); 
				}
				
				//Remove multiple items
				else
				{
					pstm = con.prepareStatement(" delete from cart_table where user_id = ? and order_id IS NULL;");
					pstm.setString(1, user_id);
					int rs = pstm.executeUpdate(); 
					
				}
			
	    	}catch(Exception e) {}
		}
		
		
		
	}

}
