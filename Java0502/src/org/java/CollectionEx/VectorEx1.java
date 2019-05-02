package org.java.CollectionEx;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

import org.java.MemberDTO.MemberDTO;

public class VectorEx1 {

	public static void main(String[] args) {
		
		Vector<MemberDTO> members = new Vector<MemberDTO>();
		
		members.add(new MemberDTO("m1", "11", "s1", 11));
		members.add(new MemberDTO("m2", "22", "s2", 22));
		members.add(new MemberDTO("m3", "33", "s3", 33));
		members.add(new MemberDTO("m4", "44", "s4", 44));
		
		/****************** | ���� | ******************/
		// Scanner�� �̿��ؼ� MemberDTO�� �ʵ�
		// userID, userPW, userName, userAge ( �ѹ��� )
		// �ֿܼ��� ���� �Է��ϰ� Vector members�� ��� ��Ҹ� 
		// Iterator�� �̿��ؼ� �ֿܼ� ����غ�����
		
		Scanner scan = new Scanner(System.in);
		//members.add(new MemberDTO());
		
		System.out.print("���̵� �Է� : ");
		String userID = scan.next();
		//members.get(4).setUserID(scan.next());
		System.out.print("��й�ȣ �Է� : ");
		String userPW = scan.next();
		//members.get(4).setUserPW(scan.next());
		System.out.print("�̸� �Է� : ");
		String userName = scan.next();
		//members.get(4).setUserName(scan.next());
		System.out.print("���� �Է� : ");
		int userAge = scan.nextInt();
		//members.get(4).setUserAge(scan.nextInt());
		
		members.add(new MemberDTO(userID, userPW, userName, 
				userAge));
		
		Iterator<MemberDTO> iterator1 = members.iterator();
		while(iterator1.hasNext()) {
			MemberDTO i = iterator1.next();
			System.out.println(i.getUserID() + " | "
					+ i.getUserPW() + " | " 
					+ i.getUserName() + " | "
					+ i.getUserAge());
			System.out.println("-------------------");
		}
		
		/********************************************/
		
	}
	
}
