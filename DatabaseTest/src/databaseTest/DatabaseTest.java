package databaseTest;

public class DatabaseTest {

	public static void main(String[] args) {
		
		String DB_URL = "jdbc:mysql://localhost:3306";
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("����̹� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� ����");
		} finally {
			System.out.println("DB ����");
		}
		
	}
	
}
