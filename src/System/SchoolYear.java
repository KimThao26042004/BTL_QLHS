package System;

public class SchoolYear {
	private String nienKhoa;
	private int khoi;
	private int lop;
	private int hocKy;
	
	
	public SchoolYear(String nienKhoa, int khoi, int lop, int hocKy) {
		super();
		this.nienKhoa = nienKhoa;
		this.khoi = khoi;
		this.lop = lop;
		this.hocKy = hocKy;
	}


	public SchoolYear() {
		super();
		this.nienKhoa = "";
		this.khoi = 0;
		this.lop = 0;
		this.hocKy = 0;
	}
	
	
	
	
}
