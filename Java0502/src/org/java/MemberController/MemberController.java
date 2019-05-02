package org.java.MemberController;

import java.util.Scanner;

import org.java.MemberCommend.MemberCommend;
import org.java.MemberCommend.MemberInsertDo;

public class MemberController {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		MemberCommend action = null;
		
		System.out.println("Äõ¸®¹® ÀÔ·Â : ");
		String query = scan.next();
		
		if (query.equals("insert")) {
			action = new MemberInsertDo();
			action.excuteQueryCommend();
		}
		
	}
	
}
