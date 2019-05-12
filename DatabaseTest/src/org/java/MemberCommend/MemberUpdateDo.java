package org.java.MemberCommend;

import java.util.Scanner;

import org.java.MemberDAO.MemberDAO;

public class MemberUpdateDo implements QueryCommend {

	@Override
	public void excuteQueryCommend() {
		
		System.out.println("회원수정");
		
		Scanner scan = new Scanner(System.in);
		MemberDAO dao = MemberDAO.getInstance();
		
		System.out.print("아이디 입력 : "); String userID = scan.next();
		System.out.print("비밀번호 입력 : "); String userPW = scan.next();
		System.out.print("변경 할 비밀번호 입력 : "); String changedUserPW = scan.next();
		System.out.print("변경 할 이름 입력 : "); String userName = scan.next();
		System.out.print("변경 할 나이 입력 : "); int userAge = scan.nextInt();
		
		int rs = dao.update(userID, userPW, changedUserPW, userName, userAge);
		
		if (rs == 1) {
			System.out.println("회원수정 성공");
		} else {
			System.out.println("회원수정 실패");
		}
		
	}

}
