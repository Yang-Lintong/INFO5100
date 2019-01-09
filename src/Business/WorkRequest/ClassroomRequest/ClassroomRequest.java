/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequest.ClassroomRequest;

import Business.Class.Course;
import Business.Classroom.Classroom;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import Business.WorkRequest.courseRequest.CourseRequest;
import java.util.Date;

/**
 *
 * @author Lintong
 */
public class ClassroomRequest extends WorkRequest{
    
    private Course course;
    private Classroom classroom;
    private static int con;
    private Date publishDate;
    private UserAccount EPAdvertising;
    private int ID;
    private String status;
    private CourseRequest courseRequest;
    
    public ClassroomRequest() {
        course = new Course();
        classroom = new Classroom();
        ID = con;
        con++;
        
    }

    public CourseRequest getCourseRequest() {
        return courseRequest;
    }

    public void setCourseRequest(CourseRequest courseRequest) {
        this.courseRequest = courseRequest;
    }

   
    
    public UserAccount getEPAdvertising() {
        return EPAdvertising;
    }

    public void setEPAdvertising(UserAccount EPAdvertising) {
        this.EPAdvertising = EPAdvertising;
    }
    
    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }
    
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
    
    
}
