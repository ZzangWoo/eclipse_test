package org.java.MemberDAO;

import java.util.ArrayList;

import org.java.MemberDTO.MemberDTO;

public class MemberDAO {

	public MemberDAO() {
		System.out.println("DAO");
	}
	
	public int insert (MemberDTO dto) {
		
		int result = 0;
		
		return result;
		
	}
	
	public ArrayList<MemberDTO> select() {
		
		ArrayList<MemberDTO> lists = new ArrayList();
		
		// 데이터베이스 데이터를 get
		lists.add(new MemberDTO("m1", "11", "s1", 11));
		lists.add(new MemberDTO("m2", "22", "s2", 22));
		lists.add(new MemberDTO("m3", "33", "s3", 33));
		lists.add(new MemberDTO("m4", "44", "s4", 44));
		lists.add(new MemberDTO("m5", "55", "s5", 55));
		
		return lists;
		
	}
	
	public int delete (String userID, String userPW) {
		
		int result = 0;
		
		// userID, userPW 동시에 일치하면 회원탈퇴성공 (1)
		// 실패면 (나머지)
		
		ArrayList<MemberDTO> lists = new ArrayList();
		
		// 데이터베이스 데이터를 get
		lists.add(new MemberDTO("m1", "11", "s1", 11));
		lists.add(new MemberDTO("m2", "22", "s2", 22));
		lists.add(new MemberDTO("m3", "33", "s3", 33));
		lists.add(new MemberDTO("m4", "44", "s4", 44));
		lists.add(new MemberDTO("m5", "55", "s5", 55));
		
		for (int i = 0; i < lists.size(); i++) {
			if (lists.get(i).getUserID().equals(userID) 
					&& lists.get(i).getUserPW().equals(userPW)) {
				result = 1;
				break;
			} else {
				result = 0;
			}
		}
		
		return result;
		
	}
	
}
