package DBConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	public static Connection getConnection() {
		
		String dbURL = "jdbc:mysql://192.168.219.122:3306/testDB?useSSL=false&serverTimezone=UTC"
				+ "&allowPublicKeyRetrieval=true";
		String hostID = "chang";
		String hostPW = "Whdlwns1007!";
		
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL, hostID, hostPW);
			System.out.println("Driver is connected");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
		}
		
		return conn;
		
	}
	
}
