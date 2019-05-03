package org.java.MemberCommend;

import java.util.Scanner;

import org.java.MemberDAO.MemberDAO;

public class DeleteDo implements QueryCommend {

	@Override
	public void excuteCommend() {
		
		MemberDAO dao = new MemberDAO();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("삭제할 아이디 : ");
		String userID = scan.next();
		
		System.out.print("삭제할 비밀번호 : ");
		String userPW = scan.next();
		
		int result = dao.delete(userID, userPW);
		
		if (result == 1) {
			System.out.println("회원 탈퇴 성공");
		} else {
			System.out.println("회원 탈퇴 실패");
		}
		
	}

}
