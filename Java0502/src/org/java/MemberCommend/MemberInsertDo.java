package org.java.MemberCommend;

import java.util.Scanner;

import org.java.MemberDAO.MemberDAO;

public class MemberInsertDo implements MemberCommend {

	@Override
	public void excuteQueryCommend() {
		
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
		
		boolean rs =
				dao.insert(userID, userPW, userName, userAge);
				
		String url = "";
		
		if (rs == true) {
			System.out.println("ȸ�� ���� ������������ �̵�");
		} else {
			System.out.println("ȸ�� ���� ������������ �̵�");
		}
		
	}

}
