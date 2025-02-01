package com.pack1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Edit")
public class EditProfileServlet extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		Cookie coo[]=req.getCookies();
		String uname=null;
		if(coo==null)
		{
			req.setAttribute("msg", "Session Expired!");
			RequestDispatcher rd=req.getRequestDispatcher("Register.jsp");
			rd.forward(req, res);
			
		}else
		{
			for(Cookie ck:coo)
			{
				if("c1".equals(ck.getName()))
				{
					uname=ck.getValue();
					req.setAttribute("name",uname);
					RequestDispatcher rds=req.getRequestDispatcher("EditProfile.jsp");
					rds.forward(req, res);
					
				}
			}
		}
	}

}
