package com.pack1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException
	{
		String uname=req.getParameter("uname");
		String pwd=req.getParameter("pwd");
		
		UserLoginDAO uld=new UserLoginDAO();
		UserBean ub=uld.reterive(uname, pwd);
		
		if(ub==null) {  
			RequestDispatcher rd=req.getRequestDispatcher("error.jsp");
			rd.forward(req, res);
		}
		else {
			ServletContext sc=req.getServletContext();
			sc.setAttribute("bean", ub);
			
			Cookie co=new Cookie("c1", ub.getUsername());
			res.addCookie(co);
			RequestDispatcher rd=req.getRequestDispatcher("Home.jsp");
			rd.forward(req, res);
			
		}
		
		
	}
	

}
