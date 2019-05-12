package org.java.MemberCommend;

import java.util.Scanner;

import org.java.MemberDAO.MemberDAO;

public class MemberDeleteDo implements QueryCommend {

	@Override
	public void excuteQueryCommend() {
		
		System.out.println("회원탈퇴");
		
		Scanner scan = new Scanner(System.in);
		MemberDAO dao = MemberDAO.getInstance();
		
		System.out.print("아이디 입력 : "); String userID = scan.next();
		System.out.print("비밀번호 입력 : "); String userPW = scan.next();
		
		int rs = dao.delete(userID, userPW);
		
		if (rs == 1)
			System.out.println("회원탈퇴 성공");
		else 
			System.out.println("회원탈퇴 실패");
		
	}

}
