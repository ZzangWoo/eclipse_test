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
		
		System.out.print("������ ���̵� : ");
		String userID = scan.next();
		
		System.out.print("������ ��й�ȣ : ");
		String userPW = scan.next();
		
		int result = dao.delete(lists, userID, userPW);
		
		if (result == 0) {
			System.out.println("ȸ�� Ż�� ����");
		} else {
			System.out.println("ȸ�� Ż�� ����");
			lists.remove(result);
		}
		
		return lists;
		
	}

}
