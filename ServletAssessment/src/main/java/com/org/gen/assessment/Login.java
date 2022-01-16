package com.org.gen.assessment;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String msg="";
		
		String n = request.getParameter("uname");
		String p = request.getParameter("upass");
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Formdata","root","Raghav@08");
			String Query ="select * from login_data where username='"+n+"' and upassword='"+p+"'";
			
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(Query);
			
			if(rs.next())
			{
				msg="Hello "+n+" ! your Login in SUCESSFULL";
			}
			else
			{
				msg="Hello "+n+" Your Login is UNSECESSFULL";
			}
			out.println("test : "+msg);
			rs.close();
			stm.close();
			
			
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}


}
