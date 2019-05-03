package org.java.MemberController;

import java.util.Scanner;

import org.java.MemberCommend.DeleteDo;
import org.java.MemberCommend.InsertDo;
import org.java.MemberCommend.QueryCommend;
import org.java.MemberCommend.SelectDo;
import org.java.MemberCommend.UpdateDo;

public class MemberController {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		QueryCommend action = null;
		
		System.out.print("Äõ¸®¹® ÀÔ·Â : ");
		String query = scan.next();
		
		if (query.equals("insert")) {
			action = new InsertDo();
			action.excuteCommend();
		} else if (query.equals("select")) {
			action = new SelectDo();
			action.excuteCommend();
		} else if (query.equals("delete")) {
			action = new DeleteDo();
			action.excuteCommend();
		} else if (query.equals("update")) {
			action = new UpdateDo();
			action.excuteCommend();
		}
		
	}
	
}
