package org.java.MemberDTO;

public class MemberDTO {

	private String userID;
	private String userPW;
	private String userName;
	private int userAge;
	
	public MemberDTO() {
		super();
	}

	public MemberDTO(String userID, String userPW, String userName, int userAge) {
		super();
		this.userID = userID;
		this.userPW = userPW;
		this.userName = userName;
		this.userAge = userAge;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUserPW() {
		return userPW;
	}

	public void setUserPW(String userPW) {
		this.userPW = userPW;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
		
}
