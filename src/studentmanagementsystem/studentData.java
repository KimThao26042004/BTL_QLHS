/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem;

import java.sql.Date;


public class studentData {

    private long studentNum;
    private String year;
    private String course;
    private String HoTen;
    private String CCCD;
    private String gender;
    private Date birth;
    private String status;
    private String image;
    private Double firstSem;
    private Double secondSem;
    private Double finals;

    public studentData(long studentNum, String year, String course, String HoTen, String CCCD, String gender, Date birth, String status, String image) {
        this.studentNum = studentNum;
        this.year = year;
        this.course = course;
        this.HoTen = HoTen;
        this.CCCD = CCCD;
        this.gender = gender;
        this.birth = birth;
        this.status = status;
        this.image = image;
    }

    public studentData(long studentNum, String year, String course, Double firstSem, Double secondSem, Double finals) {
        this.studentNum = studentNum;
        this.year = year;
        this.course = course;
        this.firstSem = firstSem;
        this.secondSem = secondSem;
        this.finals = finals;
    }

    public long getStudentNum() {
        return studentNum;
    }

    public String getYear() {
        return year;
    }

    public String getCourse() {
        return course;
    }

    public String getHoTen() {
        return HoTen;
    }

    public String getCCCD() {
        return CCCD;
    }

    public String getGender() {
        return gender;
    }

    public Date getBirth() {
        return birth;
    }

    public String getStatus() {
        return status;
    }

    public String getImage() {
        return image;
    }

    public Double getFirstSem() {
        return firstSem;
    }

    public Double getSecondSem() {
        return secondSem;
    }

    public Double getFinals() {
        return finals;
    }

}
