package org.java.MemberCommend;

import java.util.ArrayList;
import java.util.Scanner;

import org.java.MemberDAO.MemberDAO;
import org.java.MemberDTO.MemberDTO;

public class DeleteDo implements QueryCommend {

	@Override
	public ArrayList<MemberDTO> excuteCommend(ArrayList<MemberDTO> lists) {
		
		MemberDAO dao = MemberDAO.getInstance();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("삭제할 아이디 : ");
		String userID = scan.next();
		
		System.out.print("삭제할 비밀번호 : ");
		String userPW = scan.next();
		
		int result = dao.delete(lists, userID, userPW);
		
		if (result == 0) {
			System.out.println("회원 탈퇴 실패");
		} else {
			System.out.println("회원 탈퇴 성공");
			lists.remove(result);
		}
		
		return lists;
		
	}

}
