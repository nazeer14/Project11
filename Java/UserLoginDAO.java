package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserLoginDAO 
{
	public UserBean reterive(String uname,String pwd)
	{
		UserBean ub=null;
		try {
			Connection con=DBconnect.getcon();
			PreparedStatement ps=con.prepareStatement("select * from TableName where USERNAME=? and PASSWORD=?");
			ps.setString(1, uname);
			ps.setString(2, pwd);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				ub=new UserBean();
				ub.setUsername(rs.getString(1));
				ub.setPassword(rs.getString(2));
				ub.setFirstname(rs.getString(3));
				ub.setLastname(rs.getString(4));
				ub.setMail_id(rs.getString(5));
				ub.setPhone(rs.getString(6));
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return ub;
	}
	

}
