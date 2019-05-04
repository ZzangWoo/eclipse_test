package org.java.MemberCommend;

import java.util.ArrayList;
import java.util.Scanner;

import org.java.MemberDAO.MemberDAO;
import org.java.MemberDTO.MemberDTO;

public class UpdateDo implements QueryCommend {

	// 회원수정은 로그인 이후에 가능
	
	@Override
	public ArrayList<MemberDTO> excuteCommend(ArrayList<MemberDTO> lists) {

		System.out.println("회원 수정");
		// 로그인 이후 데이터베이스의 아이디로 조회하고 (Session이용)
		// 데이터를 get한 후에 수정
		MemberDAO dao = MemberDAO.getInstance();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("아이디 입력 : ");
		String userID = scan.next();
		
		int result = dao.checkID(lists, userID);
		
		if (result == 1) {
			System.out.println("아이디 있음");
		} else {
			System.out.println("아이디 없음");
		}
		
		return lists;
	}

}
