package com.pack1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class UpdateProfileServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		String fname=req.getParameter("ufname");
		String lname=req.getParameter("ulname");
		String mail=req.getParameter("umail");
		String phone=req.getParameter("uphone");
		
		UserBean ub=new UserBean();
		ub.setFirstname(fname);
		ub.setLastname(lname);
		ub.setMail_id(mail);
		ub.setPhone(phone);
		
		UpdateProfileDAO upd=new UpdateProfileDAO();
		int rowCount=upd.update(ub);
		if(rowCount==0)
		{
			req.setAttribute("msg", "Data not Updated");
			res.sendRedirect("Register.jsp");			
		}
		else
		{
			RequestDispatcher rd=req.getRequestDispatcher("update.jsp");
			rd.forward(req, res);
		}
	}

}
