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
		
		UserBean ub=new UserBean();
		ub.setUsername(req.getParameter("uname"));
		ub.setFirstname(req.getParameter("ufname"));
		ub.setLastname(req.getParameter("ulname"));
		ub.setMail_id(req.getParameter("umail"));
		ub.setPhone(req.getParameter("uphone"));
		
		UpdateProfileDAO upd=new UpdateProfileDAO();
		int rowCount=upd.update(ub);
		if(rowCount==0)
		{
			req.setAttribute("msg", "Data not Updated");
			RequestDispatcher rd=req.getRequestDispatcher("update.jsp");
			rd.forward(req, res);		
		}
		else
		{
			req.setAttribute("msg", "User details Updated Successfully.");
			RequestDispatcher rd=req.getRequestDispatcher("update.jsp");
			rd.forward(req, res);
		}
	}

}
