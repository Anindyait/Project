package pkg;

import java.io.*;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Profile
 */
@WebServlet("/Profile")
public class Profile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Profile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * 
	 */
    
    String first_name=null;
    String last_name=null;
    
    void DB_Access(String email)
    {
    	try {
			Connection con;
			PreparedStatement pstm;
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet", "root", "abcd"); //DriverManager is a class 
			
			
			pstm = con.prepareStatement("select first_name, second_name from user_table where email = ?;");
			pstm.setString(1, email);
			
			ResultSet rs = pstm.executeQuery();
			
			if(rs.next())
			{
				first_name = rs.getString("first_name");
				last_name = rs.getString("second_name");
			}
			
    	}catch(Exception e) {}
    }
    
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();
		System.out.println("get");
		
		
		Cookie ck[] = request.getCookies();
		int flag = 0;
		String email=null;
		if(ck!=null)
		{
			for(Cookie cookie: ck)
			{
				if(cookie.getName().equals("email"))
				{
					email = cookie.getValue();
					System.out.println(email+" get");
					flag = 1;
				}
			}
		}
		
		if(flag == 0)
		{
			request.getRequestDispatcher("Login").include(request, response);
		}
		else
		{
			DB_Access(email);
		   	request.setAttribute("first_name", first_name);
			request.getRequestDispatcher("profile.jsp").include(request, response);

			
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	

	}
}