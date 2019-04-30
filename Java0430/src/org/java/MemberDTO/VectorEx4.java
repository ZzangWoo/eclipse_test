package org.java.MemberDTO;

import java.util.Vector;

public class VectorEx4 {

	public static void main(String[] args) {
		
		Vector<MemberDTO> members = new Vector();
		
		members.add(new MemberDTO("m1", "1111", "S1", 10));
		members.add(new MemberDTO("m2", "2222", "S2", 20));
		members.add(new MemberDTO("m3", "3333", "S3", 30));
		
		/*
		for (int i = 0; i < members.size(); i++) {
			String userID = members.get(i).getUserID();
			String userPW = members.get(i).getUserPW();
			String userName = members.get(i).getUserName();
			int userAge = members.get(i).getUserAge();
			
			System.out.println(userID + " | " + userPW
					+ " | " + userName + " | " + userAge);
			
			System.out.println("--------------------");
		}
		*/
		
		for (MemberDTO dto : members) {
			System.out.println(dto.getUserID() + " | "
					+ dto.getUserPW() + " | "
					+ dto.getUserName() + " | "
					+ dto.getUserAge());
			System.out.println("--------------------");
		}
		
		
		
	}
	
}
