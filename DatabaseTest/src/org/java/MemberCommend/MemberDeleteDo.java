package org.java.MemberCommend;

import java.util.Scanner;

import org.java.MemberDAO.MemberDAO;

public class MemberDeleteDo implements QueryCommend {

	@Override
	public void excuteQueryCommend() {
		
		System.out.println("ȸ��Ż��");
		
		Scanner scan = new Scanner(System.in);
		MemberDAO dao = MemberDAO.getInstance();
		
		System.out.print("���̵� �Է� : "); String userID = scan.next();
		System.out.print("��й�ȣ �Է� : "); String userPW = scan.next();
		
		int rs = dao.delete(userID, userPW);
		
		if (rs == 1)
			System.out.println("ȸ��Ż�� ����");
		else 
			System.out.println("ȸ��Ż�� ����");
		
	}

}
