package org.java.MemberCommend;

import java.util.ArrayList;
import java.util.Scanner;

import org.java.MemberDAO.MemberDAO;
import org.java.MemberDTO.MemberDTO;

public class UpdateDo implements QueryCommend {

	// ȸ�������� �α��� ���Ŀ� ����
	
	@Override
	public ArrayList<MemberDTO> excuteCommend(ArrayList<MemberDTO> lists) {

		System.out.println("ȸ�� ����");
		// �α��� ���� �����ͺ��̽��� ���̵�� ��ȸ�ϰ� (Session�̿�)
		// �����͸� get�� �Ŀ� ����
		MemberDAO dao = MemberDAO.getInstance();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���̵� �Է� : ");
		String userID = scan.next();
		
		int result = dao.checkID(lists, userID);
		
		if (result == 1) {
			System.out.println("���̵� ����");
		} else {
			System.out.println("���̵� ����");
		}
		
		return lists;
	}

}
