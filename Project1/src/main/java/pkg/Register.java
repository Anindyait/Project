package pkg;

import java.io.*;
import java.sql.*;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 * 
	 */
    
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
	   	request.setAttribute("existing_phone", "hidden");
	   	request.setAttribute("existing_email", "hidden");
    	request.getRequestDispatcher("register.jsp").include(request, response);
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		ServletContext context=getServletContext(); 
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		

		
		//getting values from input fields
		String first_name = request.getParameter("first-name");
		String last_name = request.getParameter("last-name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String dd = request.getParameter("dd");
		String mm = request.getParameter("mm");
		String yyyy = request.getParameter("yyyy");
		String gender = request.getParameter("gender");
		String address = request.getParameter("address");
		String password = request.getParameter("password");
		
		String dob = yyyy + "-" + mm + "-" + dd;
		System.out.println(first_name+ " " + last_name);
		System.out.println(password);
		System.out.println(email);
		System.out.println(dob);
		
		
		try 
		{
			Connection con;
			PreparedStatement pstm; 			       //class to prepare statement
			
			Class.forName("com.mysql.cj.jdbc.Driver"); //Class is a class
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet", "root", "anindya"); //DriverManager is a class 
														//jdbc:mysql then ip address then port no. then db name
													

			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery("select email, phone from user_table;");
			int flag = 0;
			while(rs.next())
			{
				System.out.println(rs.getString("phone") +" "+ rs.getString("email"));
				
				if(rs.getString("phone").equals(phone))
				{
					flag = 1;
				}
				
				if(rs.getString("email").equals(email))
				{
					flag = 2;
				}
				
				
			}
			
			if(flag == 1)
			{
				//pw.println("Phone no. already exists!");
			   	request.setAttribute("existing_email", "hidden");
		    	request.getRequestDispatcher("register.jsp").include(request, response);

			}
			else if(flag == 2)
			{
				//pw.println("Email ID already exists!");
			   	request.setAttribute("existing_phone", "hidden");
		    	request.getRequestDispatcher("register.jsp").include(request, response);

			}
			else {
															//mysql username and password
				pstm  = con.prepareStatement("insert into user_table values(?, ?, ?, ?, ?, ?, ?, ?)");
				pstm.setString(1, first_name); 					// goes to 1st q mark
				pstm.setString(2, last_name); 
				pstm.setString(3, email); 
				pstm.setString(4, phone);
				pstm.setString(5, dob);
				pstm.setString(6, gender);
				pstm.setString(7, address);
				pstm.setString(8, password);
				
				pstm.executeUpdate();
				
				
				
		    	request.getRequestDispatcher("postRegister.html").include(request, response);

			}
			
			
			
		}catch(Exception e) {}
	}
	}

