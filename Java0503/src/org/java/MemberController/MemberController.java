package org.java.MemberController;

import java.util.ArrayList;
import java.util.Scanner;

import org.java.MemberCommend.DeleteDo;
import org.java.MemberCommend.InsertDo;
import org.java.MemberCommend.ModifyDo;
import org.java.MemberCommend.QueryCommend;
import org.java.MemberCommend.SelectDo;
import org.java.MemberCommend.UpdateDo;
import org.java.MemberDAO.MemberDAO;
import org.java.MemberDTO.MemberDTO;

public class MemberController {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		MemberDAO dao = new MemberDAO();
		QueryCommend action = null;
		
		boolean bool = false;
		
		// ArrayList 불러오기
		ArrayList<MemberDTO> lists = dao.makeArrayList();
		
		while (!bool) {
			
			System.out.print("쿼리문 입력 : ");
			String query = scan.next();
			
			if (query.equals("insert")) {
				action = new InsertDo();
				lists = action.excuteCommend(lists);
			} else if (query.equals("select")) {
				action = new SelectDo();
				lists = action.excuteCommend(lists);
			} else if (query.equals("delete")) {
				action = new DeleteDo();
				lists = action.excuteCommend(lists);
			} else if (query.equals("update")) {
				action = new ModifyDo();
				lists = action.excuteCommend(lists);
			} else if (query.equals("exit")) {
				System.out.println("종료");
				bool = true;
			} else {
				System.out.println("쿼리문 입력 오류");
			}
			
		}
		
		
	}
	
}
