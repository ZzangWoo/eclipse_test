package MemberCommend;

import MemberDAO.MemberDAO;

public class MemberInsertDo implements QueryCommend {

	@Override
	public void excuteQueryCommend() {
		
		System.out.println("ȸ������");
		
		MemberDAO dao = MemberDAO.getInstance();
		
		
		
		//int rs = dao.insert(userID, userPW, userName, userAge);
		
	}

}
