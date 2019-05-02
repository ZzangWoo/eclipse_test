package org.java.MemberDAO;

import java.util.ArrayList;

import org.java.MemberDTO.MemberDTO;

public class MemberDAO {

		
	public MemberDAO() {
		System.out.println("DAO");
	}
		
	public boolean insert (String userID, String userPW, String userName, int userAge) {
		
		boolean rs = false;
		
		ArrayList<MemberDTO> member = new ArrayList();
		
		member.add(new MemberDTO(userID, userPW, 
				userName, userAge));
		
		if (member.get(0) != null) {
			System.out.println("회원 가입 성공");
			rs = true;
		} else {
			System.out.println("회원 가입 실패");
			rs = false;
		}
		
		return rs;
		
	}
	
	public boolean update (MemberDTO member) {
	
		boolean rs = false;
		
		ArrayList<MemberDTO> memberArr = new ArrayList();
		
		memberArr.add(new MemberDTO(member.getUserID(),
									member.getUserPW(),
									member.getUserName(),
									member.getUserAge()));
		
		if (memberArr.get(0) != null) {
			System.out.println("회원 수정 성공");
			rs = true;
		} else {
			System.out.println("회원 수정 실패");
			rs = false;
		}
		
		return rs;
		
	}
	
}
