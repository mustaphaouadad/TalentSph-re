package Daos.DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	private static Connection coon ;
	
	public static Connection getCoon() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			coon= DriverManager.getConnection("jdbc:mysql://localhost:3306/TalentSph","root","0000");
			 System.out.println("connection sucssus");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		return coon;
	}

}
