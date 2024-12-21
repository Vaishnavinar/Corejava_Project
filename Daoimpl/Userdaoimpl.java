package Daoimpl;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Dao.UserDao;
import Helper.Connect;
import Pojo.UserPojo;

public class Userdaoimpl implements UserDao{
	
	Connection con=Connect.getConnection();
	PreparedStatement ps;

	@Override
	public boolean register(UserPojo userPojo) {
		try {
			String q="insert into register(username,email,password) values(?,?,?)";
			ps=con.prepareStatement(q);
			ps.setString(1, userPojo.getUsername());
			ps.setString(2,userPojo.getEmail());
			ps.setString(3, userPojo.getPassword());
			
			int x=ps.executeUpdate();
			if(x>0)
			{
				return true;
			}
			else {
				return false;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean login(String email, String password) {
		
		try {
			String q="select * from register where email=? and password=?";
			ps=con.prepareStatement(q);
			ps.setString(1,email);
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				return true;
			}
			else {
				return false;
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		return false;
	}
	
	

}
