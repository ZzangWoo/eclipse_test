package org.java.MemberDTO;

import java.util.Vector;

public class VectorEx3 {

	public static void main(String[] args) {
		
		Vector<MemberDTO> members = new Vector<MemberDTO>();
		
		members.add(new MemberDTO());
		members.add(new MemberDTO());
		members.add(new MemberDTO());
		members.add(new MemberDTO());
		members.add(new MemberDTO());
		
		// Vector 0��° ��ҿ� ����� �ʱ�ȭ
		members.get(0).setUserID("m1");
		members.get(0).setUserPW("1111");
		members.get(0).setUserName("s1");
		members.get(0).setUserAge(10);
		
		// Vector 0��° ��ҿ� ����� get
		String userID = members.get(0).getUserID();
		String userPW = members.get(0).getUserPW();
		String userName = members.get(0).getUserName();
		int userAge = members.get(0).getUserAge();
		
		System.out.println(userID + " | " + userPW
				+ " | " + userName + " | " + userAge);
		
		System.out.println("--------------------");
		
		/*************** | �� �� | *****************/
		// members.get(1) ��Ҹ� setters, getters�� �̿��ؼ�
		// ���� �ʵ带 ��� �ʱ�ȭ (���ǰ�����) �ϰ� �ֿܼ� ���
		
		members.get(1).setUserID("m2");
		members.get(1).setUserPW("2222");
		members.get(1).setUserName("s2");
		members.get(1).setUserAge(20);
		
		String userID2 = members.get(1).getUserID();
		String userPW2 = members.get(1).getUserPW();
		String userName2 = members.get(1).getUserName();
		int userAge2 = members.get(1).getUserAge();
		
		System.out.println(userID2 + " | " + userPW2
				+ " | " + userName2 + " | " + userAge2);
		/*****************************************/
	}
	
}
