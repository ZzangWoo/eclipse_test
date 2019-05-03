package org.java.MemberCommend;

import java.util.Scanner;

import org.java.MemberDAO.MemberDAO;
import org.java.MemberDTO.MemberDTO;

public class InsertDo implements QueryCommend {

	@Override
	public void excuteCommend() {
	
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
		
		MemberDTO dto = 
				new MemberDTO(userID, userPW, userName, userAge);
		
		int result = dao.insert(dto);
		
		if (result == 1) {
			System.out.println("회원 가입 성공");
		} else {
			System.out.println("회원 가입 실패");
		}
		
	}

}
