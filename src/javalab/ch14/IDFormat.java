package javalab.ch14;

public class IDFormat {
	private String userID;

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) throws IDFormatException{
		if(userID ==null) {
			throw new IDFormatException("아이디는 null이 될수없다")
		} else if (userID.length() < 8 ||userID.length()>= 20) {
			throw new IDFormatException("아이디는 8자이상 20자 이하로 사용하세요.  ")
		}
		
		this.userID = userID;
	}

	@Override
	public String toString() {
		return "IDFormat [userID=" + userID + "]";
	}
	
}
