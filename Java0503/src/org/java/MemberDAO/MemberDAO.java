package org.java.MemberDAO;

import java.util.ArrayList;

import org.java.MemberDTO.MemberDTO;

public class MemberDAO {

	private ArrayList<MemberDTO> resultList;
	
	public MemberDAO() {
		System.out.println("DAO");
	}
	
	public ArrayList<MemberDTO> makeArrayList() {
		
		ArrayList<MemberDTO> lists = new ArrayList();
		
		// 데이터베이스 데이터를 get
				lists.add(new MemberDTO("m1", "11", "s1", 11));
				lists.add(new MemberDTO("m2", "22", "s2", 22));
				lists.add(new MemberDTO("m3", "33", "s3", 33));
				lists.add(new MemberDTO("m4", "44", "s4", 44));
				lists.add(new MemberDTO("m5", "55", "s5", 55));
		
		return lists;
		
	}
	
	public int checkID(ArrayList<MemberDTO> lists, String userID) {
		
		int check = 0;
		
		for (int i = 0; i < lists.size(); i++) {
			if (lists.get(i).getUserID().equals(userID)) {
				check = 1;
				return check;
			} else {
				check = 0;
			}
		}
		
		return check;
		
	}
	
	public ArrayList<MemberDTO> select() {
		
		ArrayList<MemberDTO> lists = new ArrayList();
		
		// 데이터베이스 데이터를 get
		lists.add(new MemberDTO("m1", "11", "s1", 11));
		lists.add(new MemberDTO("m2", "22", "s2", 22));
		lists.add(new MemberDTO("m3", "33", "s3", 33));
		lists.add(new MemberDTO("m4", "44", "s4", 44));
		lists.add(new MemberDTO("m5", "55", "s5", 55));
		
		return lists;
		
	}
	
	public ArrayList<MemberDTO> insert (ArrayList<MemberDTO> lists, MemberDTO dto) {
		
		resultList = lists;
		resultList.add(dto);
		
		return resultList;
		
	}
	
	public int update (ArrayList<MemberDTO> lists, MemberDTO dto) {
		
		int i;
		
		for (i = 0; i < lists.size(); i++) {
			if (lists.get(i).getUserID()
					.equals(dto.getUserID()) &&
				lists.get(i).getUserPW()
					.equals(dto.getUserPW())) {
				 return i;
			}
				
		}
		
		i = 0;
		
		return i;
		
	}
	
	public int delete (ArrayList<MemberDTO> lists, String userID, String userPW) {
		
		int i;
		
		// userID, userPW 동시에 일치하면 회원탈퇴성공 (1)
		// 실패면 (나머지)
				
		for (i = 0; i < lists.size(); i++) {
			if (lists.get(i).getUserID().equals(userID) 
					&& lists.get(i).getUserPW().equals(userPW)) {
				return i;
			}
		}
		
		i = 0;
		
		return i;
		
	}
	
}
