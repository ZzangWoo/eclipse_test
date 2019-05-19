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
		
		// Connect 생성
		//Connection conn = null;
		// SQL 처리
		// 밑에 query에 query문 작성할 때 ? 부분에 값들을 자동으로 집어넣어주는 역할해주는놈
		PreparedStatement pstm = null;
		// 실제 쿼리문
		String query = "";
	
		try {
			// DB 연동
			//conn = DriverManager.getConnection(dbURL, hostID, hostPW);
			
			// 실제 쿼리문
			query = "insert into dbTest(userID, userPW, userName, userAge) " +
			"values(?,?,?,?);";
			
			// SQL 처리 ( ?에 value 담아주기 )
			pstm = conn.prepareStatement(query); // PreparedStatement에 저장
			
			pstm.setString(1, userID);
			pstm.setString(2, userPW);
			pstm.setString(3, userName);
			pstm.setInt(4, userAge);
			
			
			// 실행
			rs = pstm.executeUpdate(); // 조회, 수정, 탈퇴.... 리턴값이 1이면 성공 0이면 실패
			
			
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
