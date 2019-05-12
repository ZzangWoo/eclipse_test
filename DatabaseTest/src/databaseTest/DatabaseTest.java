package databaseTest;

public class DatabaseTest {

	public static void main(String[] args) {
		
		String DB_URL = "jdbc:mysql://localhost:3306";
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 있음");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 없음");
		} finally {
			System.out.println("DB 종료");
		}
		
	}
	
}
