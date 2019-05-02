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
		
		/****************** | 문제 | ******************/
		// Scanner를 이용해서 MemberDTO의 필드
		// userID, userPW, userName, userAge ( 한번만 )
		// 콘솔에서 각각 입력하고 Vector members의 모든 요소를 
		// Iterator를 이용해서 콘솔에 출력해보세요
		
		Scanner scan = new Scanner(System.in);
		//members.add(new MemberDTO());
		
		System.out.print("아이디 입력 : ");
		String userID = scan.next();
		//members.get(4).setUserID(scan.next());
		System.out.print("비밀번호 입력 : ");
		String userPW = scan.next();
		//members.get(4).setUserPW(scan.next());
		System.out.print("이름 입력 : ");
		String userName = scan.next();
		//members.get(4).setUserName(scan.next());
		System.out.print("나이 입력 : ");
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
