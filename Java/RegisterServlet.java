package com.pack1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		UserBean ub=new UserBean();
		ub.setUsername(req.getParameter("uname"));
		ub.setPassword(req.getParameter("pwd"));
		ub.setFirstname(req.getParameter("fname"));
		ub.setLastname(req.getParameter("lname"));
		ub.setMail_id(req.getParameter("mail"));
		ub.setPhone(req.getParameter("number"));
		
		UserRegisterDAO urd=new UserRegisterDAO();
		int rowCount=urd.insert(ub);
		
		if(rowCount>0)
		{
			req.setAttribute("msg", "Registartion Success.");
			RequestDispatcher rd=req.getRequestDispatcher("Register.jsp");
			rd.forward(req, res);
		}
		else
		{
			req.setAttribute("msg", "Registration Unsuccess!");
			RequestDispatcher rd=req.getRequestDispatcher("Register.jsp");
			rd.forward(req, res);
		}
		
	}

}
