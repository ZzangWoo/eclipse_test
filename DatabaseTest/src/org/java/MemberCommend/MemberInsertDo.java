package org.java.MemberCommend;

import java.util.Scanner;

import org.java.MemberDAO.MemberDAO;

public class MemberInsertDo implements QueryCommend {

	@Override
	public void excuteQueryCommend() {
		
		System.out.println("ȸ������");
		
		Scanner scan = new Scanner(System.in);
		MemberDAO dao = MemberDAO.getInstance();
		
		System.out.print("���̵� �Է� : "); String userID = scan.next();
		System.out.print("��й�ȣ �Է� : "); String userPW = scan.next();
		System.out.print("�̸� �Է� : "); String userName = scan.next();
		System.out.print("���� �Է� : "); int userAge = scan.nextInt();
		
		int rs = dao.insert(userID, userPW, userName, userAge);
		
		if (rs == 1)
			System.out.println("ȸ������ ����");
		else
			System.out.println("ȸ������ ����");
		
	}

}
