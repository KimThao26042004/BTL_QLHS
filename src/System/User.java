package System;

public class User {
	private String userName;
	private String passWord;
	private int vaitro;
	public User(String userName, String passWord, int vaitro) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.vaitro = vaitro;
	}
	
	
	public User() {
		super();
		this.userName = "";
		this.passWord = "";
		this.vaitro = 0;
	}


	public int setVaitro(int vaiTroCanSet)
	{
		this.vaitro = vaiTroCanSet;
		return 0;
	}
	
	public boolean login()
	{
		// Matching Code with UI Code JavaFX
	};
}
