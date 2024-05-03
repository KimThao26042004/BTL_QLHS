package System;

public class StudentLogin {
	private String userName;
	private String passWord;
	private String MSHS;
	
	
	public StudentLogin(String userName, String passWord, String mSHS) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		MSHS = mSHS;
	}


	public StudentLogin() {
		super();
		this.userName = "";
		this.passWord = "";
		this.MSHS = "";
	}
	
	
	
	
}
