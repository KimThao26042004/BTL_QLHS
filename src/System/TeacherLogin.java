package System;

public class TeacherLogin {
	private String userName;
	private String passWord;
	private String MSGV;
	
	
	public TeacherLogin(String userName, String passWord, String mSGV) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		MSGV = mSGV;
	}
	
	
	public TeacherLogin() {
		super();
		this.userName = "";
		this.passWord = "";
		MSGV = "";
	}
	
	
	
}
