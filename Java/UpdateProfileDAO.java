package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateProfileDAO 
{
	
	public int update(UserBean ub)
	{
		System.out.println(ub);
		int rc=0;
		try {
			Connection con=DBconnect.getcon();
			PreparedStatement ps=con.prepareStatement("update TableName set FIRSTNAME=? , LASTNAME=?, MAIL_ID=?, PHONE=? where USERNAME=?");
			ps.setString(1, ub.getFirstname());
			ps.setString(2, ub.getLastname());
			ps.setString(3, ub.getMail_id());
			ps.setString(4, ub.getPhone());
			ps.setString(5, ub.getUsername());
			
			rc=ps.executeUpdate();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return rc;
	}
	

}
