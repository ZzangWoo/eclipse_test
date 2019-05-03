package org.java.MemberCommend;

import java.util.ArrayList;
import java.util.Iterator;

import org.java.MemberDAO.MemberDAO;
import org.java.MemberDTO.MemberDTO;

public class SelectDo implements QueryCommend {

	@Override
	public void excuteCommend() {
		
		MemberDAO dao = new MemberDAO();
		
		ArrayList<MemberDTO> lists = dao.select();
		
		// 반환값이 null이면 데이터베이스 정보가 없고
		// null이 아니면 데이터베이스 정보가 있다
		
		if (lists == null) {
			System.out.println("회원 조회 실패");
		} else {
			System.out.println("회원 조회 성공");
			
			Iterator<MemberDTO> iterator = lists.iterator();
			while (iterator.hasNext()) {
				MemberDTO i = iterator.next();
				System.out.print(i.getUserID() + " | " + 
								 i.getUserPW() + " | " +
								 i.getUserName() + " | " +
								 i.getUserAge());
				System.out.println("\n------------------");
			}
		}
		
	}

}
