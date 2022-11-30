package pkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Product
 */
@WebServlet("/Product")
public class Product extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Product() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		ServletContext context=getServletContext();  

		//pw.println("<h2>"+"Product"+"</h2>");
		//RequestDispatcher rd=request.getRequestDispatcher("Dashboard");  
		RequestDispatcher rd=request.getRequestDispatcher("header.html"); 
		rd.include(request, response); 
		
		RequestDispatcher rd2=request.getRequestDispatcher("product.html"); 
		rd2.include(request, response); 
		
		pw.println("<h2>"+"Product"+"</h2>");
		RequestDispatcher rd1=request.getRequestDispatcher("footer.html"); 
		rd1.include(request, response); 

        pw.close();
		
			
	}

}