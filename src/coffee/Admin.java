package coffee;

public class Admin {
	private String id;
	private String pw;
	private String nickName;
	
	public Admin(String id,String pw,String nickName) {
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
		return "Admin [id=" + id + ", pw=" + pw + ", nickName=" + nickName + "]";
	}
	
}
