package org.java.MemberDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.java.MemberDTO.MemberDTO;

public class MemberDAO {

	private static MemberDAO dao;
	
	private String dbURL = "jdbc:mysql://192.168.219.122:3306/testDB?useSSL=false&serverTimezone=UTC"
			+ "&allowPublicKeyRetrieval=true";
	private String hostID = "chang";
	private String hostPW = "Whdlwns1007!";
	
	public MemberDAO() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is connected");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver is not connected");
		}
		
	}
	
	public static MemberDAO getInstance() {
		
		if (dao == null) {
			dao = new MemberDAO();
		}
		
		return dao;
		
	}
	
	public int insert (String userID, String userPW, String userName, int userAge) {
		
		int rs = 0;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		
		try {
			
			conn = DriverManager.getConnection(dbURL, hostID, hostPW);
			
			query = "insert into dbTest values(?, ?, ?, ?);";
			
			pstm = conn.prepareStatement(query);
			
			pstm.setString(1, userID);
			pstm.setString(2, userPW);
			pstm.setString(3, userName);
			pstm.setInt(4, userAge);
			
			rs = pstm.executeUpdate();
			
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
	
	public int delete (String userID, String userPW) {
		
		int rs = 0;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		
		try {
			
			conn = DriverManager.getConnection(dbURL, hostID, hostPW);
			query = "delete from dbTest where userID = ? and userPW = ?;";
			pstm = conn.prepareStatement(query);
			
			pstm.setString(1, userID);
			pstm.setString(2, userPW);
			
			rs = pstm.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("Wrong userID or userPW");
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
	
	public int update (String userID, String userPW, String changedUserPW, String userName, int userAge) {
		
		int rs = 0;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		
		try {
			
			conn = DriverManager.getConnection(dbURL, hostID, hostPW);
			query = "update dbTest set userPW = ?, userName = ?, userAge = ? where userID = ? and userPW = ?;";
			pstm = conn.prepareStatement(query);
			
			pstm.setString(1, changedUserPW);
			pstm.setString(2, userName);
			pstm.setInt(3, userAge);
			pstm.setString(4, userID);
			pstm.setString(5, userPW);
			
			rs = pstm.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("Wrong userID or userPW");
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
	
	public ArrayList<MemberDTO> select() {
		
		ArrayList<MemberDTO> outputTable = new ArrayList();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		ResultSet rs = null;
		
		try {
			
			conn = DriverManager.getConnection(dbURL, hostID, hostPW);
			query = "select * from dbTest;";
			pstm = conn.prepareStatement(query);
			
			rs = pstm.executeQuery();
			
			while (rs.next()) {
				outputTable.add(new MemberDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
			}
			
		} catch (SQLException e) {
			System.out.println("Select is failed");
		}
		
		return outputTable;
		
	}
	
}
