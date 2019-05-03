package org.java.MemberCommend;

import java.util.ArrayList;
import java.util.Scanner;

import org.java.MemberDAO.MemberDAO;
import org.java.MemberDTO.MemberDTO;

public class InsertDo implements QueryCommend {

	@Override
	public ArrayList<MemberDTO> excuteCommend(ArrayList<MemberDTO> lists) {
	
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
		
		int preListSize = lists.size();
		
		MemberDTO dto = 
				new MemberDTO(userID, userPW, userName, userAge);
		
		dao.insert(lists, dto);
				
		int nowListSize = lists.size();
		
		if (nowListSize > preListSize) {
			System.out.println("회원 가입 성공");
		} else {
			System.out.println("회원 가입 실패");
		}
		
		return lists;
		
	}

}
