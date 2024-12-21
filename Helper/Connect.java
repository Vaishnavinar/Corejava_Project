package Helper;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
public static Connection con=null;
public static Connection getConnection() {
	
	try {
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/core_java","root","Rutubro2308#");
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	return con;
	
}
}
