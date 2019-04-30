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
		
		// Vector 0번째 요소에 멤버를 초기화
		members.get(0).setUserID("m1");
		members.get(0).setUserPW("1111");
		members.get(0).setUserName("s1");
		members.get(0).setUserAge(10);
		
		// Vector 0번째 요소에 멤버를 get
		String userID = members.get(0).getUserID();
		String userPW = members.get(0).getUserPW();
		String userName = members.get(0).getUserName();
		int userAge = members.get(0).getUserAge();
		
		System.out.println(userID + " | " + userPW
				+ " | " + userName + " | " + userAge);
		
		System.out.println("--------------------");
		
		/*************** | 문 제 | *****************/
		// members.get(1) 요소를 setters, getters를 이용해서
		// 각각 필드를 모두 초기화 (임의값으로) 하고 콘솔에 출력
		
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
