package org.java.MemberCommend;

import java.util.ArrayList;
import java.util.Scanner;

import org.java.MemberDAO.MemberDAO;
import org.java.MemberDTO.MemberDTO;

public class InsertDo implements QueryCommend {

	@Override
	public ArrayList<MemberDTO> excuteCommend(ArrayList<MemberDTO> lists) {
	
		System.out.println("ȸ�� ����");
		
		MemberDAO dao = new MemberDAO();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���̵� �Է� : ");
		String userID = scan.next();
		
		System.out.print("��й�ȣ �Է� : ");
		String userPW = scan.next();
		
		System.out.print("�̸� �Է� : ");
		String userName = scan.next();
		
		System.out.print("���� �Է� : ");
		int userAge = scan.nextInt();
		
		int preListSize = lists.size();
		
		MemberDTO dto = 
				new MemberDTO(userID, userPW, userName, userAge);
		
		dao.insert(lists, dto);
				
		int nowListSize = lists.size();
		
		if (nowListSize > preListSize) {
			System.out.println("ȸ�� ���� ����");
		} else {
			System.out.println("ȸ�� ���� ����");
		}
		
		return lists;
		
	}

}
