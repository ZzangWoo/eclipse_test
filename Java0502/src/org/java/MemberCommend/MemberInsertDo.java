package org.java.MemberCommend;

import java.util.Scanner;

import org.java.MemberDAO.MemberDAO;

public class MemberInsertDo implements MemberCommend {

	@Override
	public void excuteQueryCommend() {
		
		System.out.println("회원 가입");
		
		MemberDAO dao = new MemberDAO();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("아이디 입력 : ");
		String userID = scan.next();
		
		System.out.print("비밀번호 입력 : ");
		String userPW = scan.next();
		
		System.out.print("이름 입력 : ");
		String userName = scan.next();
		
		System.out.print("나이 입력 : ");
		int userAge = scan.nextInt();
		
		boolean rs =
				dao.insert(userID, userPW, userName, userAge);
				
		String url = "";
		
		if (rs == true) {
			System.out.println("회원 가입 성공페이지로 이동");
		} else {
			System.out.println("회원 가입 실패페이지로 이동");
		}
		
	}

}
