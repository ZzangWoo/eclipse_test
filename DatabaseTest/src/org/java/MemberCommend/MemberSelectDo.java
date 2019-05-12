package org.java.MemberCommend;

import java.util.ArrayList;
import java.util.Iterator;

import org.java.MemberDAO.MemberDAO;
import org.java.MemberDTO.MemberDTO;

public class MemberSelectDo implements QueryCommend {

	@Override
	public void excuteQueryCommend() {

		System.out.println("회원조회");
		
		MemberDAO dao = MemberDAO.getInstance();
		
		ArrayList<MemberDTO> outputTable = dao.select();
		
		if (outputTable != null) {
			System.out.println("회원조회 성공");
		} else {
			System.out.println("회원조회 실패");
		}
		
		System.out.println("--------------------");
		
		Iterator<MemberDTO> iterator = outputTable.iterator();
		while (iterator.hasNext()) {
			MemberDTO outputField = iterator.next();
			
			System.out.println(outputField.getUserID() + " | " + outputField.getUserPW() + " | " +
					outputField.getUserName() + " | " + outputField.getUserAge());
			System.out.println("--------------------");
		}
		
	}

}
