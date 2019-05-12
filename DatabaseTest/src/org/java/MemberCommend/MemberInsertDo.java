package org.java.MemberCommend;

import java.util.Scanner;

import org.java.MemberDAO.MemberDAO;

public class MemberInsertDo implements QueryCommend {

	@Override
	public void excuteQueryCommend() {
		
		System.out.println("회원가입");
		
		Scanner scan = new Scanner(System.in);
		MemberDAO dao = MemberDAO.getInstance();
		
		System.out.print("아이디 입력 : "); String userID = scan.next();
		System.out.print("비밀번호 입력 : "); String userPW = scan.next();
		System.out.print("이름 입력 : "); String userName = scan.next();
		System.out.print("나이 입력 : "); int userAge = scan.nextInt();
		
		int rs = dao.insert(userID, userPW, userName, userAge);
		
		if (rs == 1)
			System.out.println("회원가입 성공");
		else
			System.out.println("회원가입 실패");
		
	}

}
