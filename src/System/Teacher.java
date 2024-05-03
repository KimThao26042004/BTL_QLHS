package System;

public class Teacher {
	private String MSGV;
	private int tuoi_GV;
	private String diachi_GV;
	private String name_GV;
	private String email_GV;
	private String SDT_GV;
	
	
	public Teacher(String mSGV, int tuoi_GV, String diachi_GV, String name_GV, String email_GV, String sDT_GV) {
		super();
		MSGV = mSGV;
		this.tuoi_GV = tuoi_GV;
		this.diachi_GV = diachi_GV;
		this.name_GV = name_GV;
		this.email_GV = email_GV;
		SDT_GV = sDT_GV;
	}


	public Teacher() {
		super();
		MSGV = "";
		this.tuoi_GV = 0;
		this.diachi_GV = "";
		this.name_GV = "";
		this.email_GV = "";
		this.SDT_GV = "";
	}
	
	
	
	
	
}
