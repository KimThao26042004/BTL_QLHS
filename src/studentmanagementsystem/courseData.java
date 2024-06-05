/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem;

public class courseData {
    
    private String course;
    private String description;
    
    public courseData(String course, String description){
        this.course = course;
        this.description = description;
    }
    public String getCourse(){
        return course;
    }
    public String getDescription(){
        return description;
    }
    
}
