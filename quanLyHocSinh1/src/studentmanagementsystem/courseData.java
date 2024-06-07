
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
