package com.org.gen.assessment;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String u=request.getParameter("username"); 
		String p=request.getParameter("pass");
		String c=request.getParameter("city");
		String co=request.getParameter("country");
		String n=request.getParameter("sname");

		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			//String driver = "com.mysql.cj.jdbc.Driver";
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Formdata","root","Raghav@08");
			
			PreparedStatement ps=conn.prepareStatement("insert into login_data values(?,?,?,?,?)");
			
			ps.setString(1,u);
			ps.setString(2,p);
			ps.setString(3,c);
			ps.setString(4,co);
			ps.setString(5,n);
			
			
			int i=ps.executeUpdate();
			if(i>0)
			{
				RequestDispatcher rd = request.getRequestDispatcher("/RegLog.html");
				rd.forward(request, response);
			}
			System.out.println("test");
		} 
		catch (Exception e2) 
		{
			System.out.println(e2);
		}
		out.close();
	}

}
