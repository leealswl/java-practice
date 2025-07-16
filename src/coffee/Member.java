package coffee;

public class Member {
	private String id;
	private String pw;
	private String nickName;
	
	public Member(String id,String pw,String nickName) {
		this.id =id;
		this.pw=pw;
		this.nickName=nickName;
	}

	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public String getNickName() {
		return nickName;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", nickName=" + nickName + "]";
	}
	
	
}
