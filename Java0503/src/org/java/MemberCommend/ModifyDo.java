package org.java.MemberCommend;

import java.util.ArrayList;
import java.util.Scanner;

import org.java.MemberDAO.MemberDAO;
import org.java.MemberDTO.MemberDTO;

public class ModifyDo implements QueryCommend {

	@Override
	public ArrayList<MemberDTO> excuteCommend(ArrayList<MemberDTO> lists) {

		System.out.println("회원 수정");
		// userID, userPW, userName, userAge
		// Scanner를 이용해서 입력하고
		// MemberDAO에 update 메서드를 구현하시오
		// MemberDTO 이용
		// 반환값이 1이면 회원 수정 성공
		// 반환값이 1이 아니면 회원 수정 실패
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("아이디 입력 : ");
		String userID = scan.next();
		
		System.out.print("비밀번호 입력 : ");
		String userPW = scan.next();
		
		System.out.print("이름 입력 : ");
		String userName = scan.next();
		
		System.out.print("나이 입력 : ");
		int userAge = scan.nextInt();
		
		MemberDTO dto = new MemberDTO(userID, userPW, userName, userAge);
		MemberDAO dao = MemberDAO.getInstance();
		
		int result = dao.update(lists, dto);
		
		if (result == 0) {
			System.out.println("회원 수정 실패");
		} else {
			System.out.println("회원 수정 성공");
			lists.get(result).setUserID(dto.getUserID());
			lists.get(result).setUserPW(dto.getUserPW());
			lists.get(result).setUserName(dto.getUserName());
			lists.get(result).setUserAge(dto.getUserAge());
		}
		
		return lists;
	}

}
