package studentmanagementsystem;

import java.sql.Date;

public class StudentData {
    private long studentNum;
    private String HoTen;
    private String CCCD;
    private String gender;
    private Date birth;
    private String status;
    private String image;
    private String lop;
    private String course;
    private StudentGrade studentGrade;


    public StudentData(long studentNum,String HoTen, String lop, String course) {
        this.studentNum = studentNum;
        this.lop = lop;
        this.course = course;
        this.HoTen = HoTen;
    }
    
    public StudentData(long studentNum, String lop, String course, String HoTen, String CCCD, String gender, Date birth, String status, String image) {
        this.studentNum = studentNum;
        this.lop = lop;
        this.course = course;
        this.HoTen = HoTen;
        this.CCCD = CCCD;
        this.gender = gender;
        this.birth = birth;
        this.status = status;
        this.image = image;
    }
    
    public StudentData(StudentGrade studentGrade) {
    	this.studentGrade = studentGrade;
    }


    public long getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(long studentNum) {
        this.studentNum = studentNum;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        this.HoTen = hoTen;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public StudentGrade getStudentGrade() {
        return studentGrade;
    }
    
    public double getFirstSem() {
        return studentGrade.getFirstSem();
    }

    public double getSecondSem() {
        return studentGrade.getSecondSem();
    }

    public double getFinals() {
        return studentGrade.getFinals();
    }

    public void setStudentGrade(StudentGrade studentGrade) {
        this.studentGrade = studentGrade;
    }


}
