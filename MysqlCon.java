package soft;

import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlCon {
	
	public Connection conneCtion()
	{
		Connection con=null;
		try{
		Class.forName("com.mysql.jdbc.Driver");
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
		
		}
		catch(Exception e){
			System.out.println("Database Didn't connect");
		}
		return con;
	}
	

}
