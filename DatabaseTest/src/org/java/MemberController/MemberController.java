package org.java.MemberController;

import java.util.Scanner;

import org.java.MemberCommend.MemberDeleteDo;
import org.java.MemberCommend.MemberInsertDo;
import org.java.MemberCommend.MemberSelectDo;
import org.java.MemberCommend.MemberUpdateDo;
import org.java.MemberCommend.QueryCommend;

public class MemberController {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		QueryCommend action = null;
		
		boolean bool = false;
		
		while (!bool) {
			
			System.out.print("쿼리문 입력 : "); String query = scan.next();
			
			if (query.equals("insert")) {
				action = new MemberInsertDo();
				action.excuteQueryCommend();
			} else if (query.equals("delete")) {
				action = new MemberDeleteDo();
				action.excuteQueryCommend();
			} else if (query.equals("update")) {
				action = new MemberUpdateDo();
				action.excuteQueryCommend();
			} else if (query.equals("select")) {
				action = new MemberSelectDo();
				action.excuteQueryCommend();
			} else if (query.equals("exit")) {
				bool = true;
			} else {
				System.out.println("쿼리문 입력 오류");
			}
			
		}
		
		
		
	}
	
}
