package org.java.MemberCommend;

import java.util.ArrayList;
import java.util.Scanner;

import org.java.MemberDAO.MemberDAO;
import org.java.MemberDTO.MemberDTO;

public class ModifyDo implements QueryCommend {

	@Override
	public ArrayList<MemberDTO> excuteCommend(ArrayList<MemberDTO> lists) {

		System.out.println("ȸ�� ����");
		// userID, userPW, userName, userAge
		// Scanner�� �̿��ؼ� �Է��ϰ�
		// MemberDAO�� update �޼��带 �����Ͻÿ�
		// MemberDTO �̿�
		// ��ȯ���� 1�̸� ȸ�� ���� ����
		// ��ȯ���� 1�� �ƴϸ� ȸ�� ���� ����
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���̵� �Է� : ");
		String userID = scan.next();
		
		System.out.print("��й�ȣ �Է� : ");
		String userPW = scan.next();
		
		System.out.print("�̸� �Է� : ");
		String userName = scan.next();
		
		System.out.print("���� �Է� : ");
		int userAge = scan.nextInt();
		
		MemberDTO dto = new MemberDTO(userID, userPW, userName, userAge);
		MemberDAO dao = MemberDAO.getInstance();
		
		int result = dao.update(lists, dto);
		
		if (result == 0) {
			System.out.println("ȸ�� ���� ����");
		} else {
			System.out.println("ȸ�� ���� ����");
			lists.get(result).setUserID(dto.getUserID());
			lists.get(result).setUserPW(dto.getUserPW());
			lists.get(result).setUserName(dto.getUserName());
			lists.get(result).setUserAge(dto.getUserAge());
		}
		
		return lists;
	}

}
