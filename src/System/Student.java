package System;

public class Student {
	private String MSHS;
	private int tuoi_HS;
	private String diaChi_HS;
	private String ten_HS;
	private int lop;
	private int khoi;
	private String email_HS;
	private String SDT_HS;
	
	
	public Student(String mSHS, int tuoi_HS, String diaChi_HS, String ten_HS, int lop, int khoi, String email_HS,
			String sDT_HS) {
		super();
		MSHS = mSHS;
		this.tuoi_HS = tuoi_HS;
		this.diaChi_HS = diaChi_HS;
		this.ten_HS = ten_HS;
		this.lop = lop;
		this.khoi = khoi;
		this.email_HS = email_HS;
		SDT_HS = sDT_HS;
	}


	public Student() {
		super();
		this.MSHS = "";
		this.tuoi_HS = 0;
		this.diaChi_HS = "";
		this.ten_HS = "";
		this.lop = 0;
		this.khoi = 0;
		this.email_HS = "";
		this.SDT_HS = "";
	}
	
	
	public void traCuuDiem()
	{

	}
	
}
