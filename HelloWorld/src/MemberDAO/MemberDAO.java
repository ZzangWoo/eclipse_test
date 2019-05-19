package MemberDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import DBConnect.DBConnect;

public class MemberDAO {

	private static MemberDAO dao;
	private static Connection conn = null;
	
	public MemberDAO() {
		
		conn = DBConnect.getConnection();
		
	}
	
	public static MemberDAO getInstance() {
		
		if (dao == null) {
			dao = new MemberDAO();
		}
		return dao;
		
	}
	
	public int insert(String userID, String userPW, String userName, int userAge) {
		
		int rs = 0;
		
		// Connect ����
		//Connection conn = null;
		// SQL ó��
		// �ؿ� query�� query�� �ۼ��� �� ? �κп� ������ �ڵ����� ����־��ִ� �������ִ³�
		PreparedStatement pstm = null;
		// ���� ������
		String query = "";
	
		try {
			// DB ����
			//conn = DriverManager.getConnection(dbURL, hostID, hostPW);
			
			// ���� ������
			query = "insert into dbTest(userID, userPW, userName, userAge) " +
			"values(?,?,?,?);";
			
			// SQL ó�� ( ?�� value ����ֱ� )
			pstm = conn.prepareStatement(query); // PreparedStatement�� ����
			
			pstm.setString(1, userID);
			pstm.setString(2, userPW);
			pstm.setString(3, userName);
			pstm.setInt(4, userAge);
			
			
			// ����
			rs = pstm.executeUpdate(); // ��ȸ, ����, Ż��.... ���ϰ��� 1�̸� ���� 0�̸� ����
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
				try {
					
					if (conn != null)
						conn.close();	
					if (pstm != null)
						pstm.close();
					
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					
				}
				
		}		
	
		
		return rs;
		
	}
	
}
