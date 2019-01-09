/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue.VolunteerRequest;

import Business.Class.Course;
import Business.Person.Volunteer;
import Business.Person.VolunteerDirectory;
import Business.WorkQueue.WorkRequest;
import Business.WorkRequest.courseRequest.CourseRequest;

/**
 *
 * @author Lintong
 */
public class VolunteerRequest extends WorkRequest{
    private int ID;
    private static int con;
    private Course course;
    private Volunteer volunteer;
    private CourseRequest courseRequest;
    
  
    public VolunteerRequest() {
        
        volunteer = new Volunteer();
        ID = con;
        con++;
    }

    public int getID() {
        return ID;
    }

    public CourseRequest getCourseRequest() {
        return courseRequest;
    }

    public void setCourseRequest(CourseRequest courseRequest) {
        this.courseRequest = courseRequest;
    }

    
   
    
    public Course getCourse() {
        return course;
    }

    public Volunteer getVolunteer() {
        return volunteer;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setVolunteer(Volunteer volunteer) {
        this.volunteer = volunteer;
    }
    
    
    
    
    
}
