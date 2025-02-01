package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserRegisterDAO {
	public int insert(UserBean ub)
	{
		int rowCount=0;
		try
		{
			Connection con=DBconnect.getcon();
			PreparedStatement ps=con.prepareStatement("insert into registation values(?,?,?,?,?,?)");
			System.out.println("Connection created");
			ps.setString(1, ub.getUsername());
			ps.setString(2, ub.getPassword());
			ps.setString(3, ub.getFirstname());
			ps.setString(4, ub.getLastname());
			ps.setString(5, ub.getMail_id());
			ps.setString(6, ub.getPhone());
			
			rowCount=ps.executeUpdate();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return rowCount;
	}

}
