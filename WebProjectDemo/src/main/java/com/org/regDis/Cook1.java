package com.org.regDis;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Cook1")
public class Cook1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("val");
		String Userid = request.getParameter("val1");
		String pass = request.getParameter("val2");
		
		if(pass.equals("abc"))
		{
			Cookie ck = new Cookie("userid", Userid);
			response.addCookie(ck);
			out.println("<h2>welcome</h2>");
		}
//		else
//		{
//			out.print("Incorrect username or password");
//			response.sendRedirect("/Cookies.html");
//		}
		
	}

}
