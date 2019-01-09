/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequest.courseRequest;

import Business.Class.Course;
import Business.Classroom.Classroom;
import static Business.Person.Person.Type.Volunteer;
import Business.Person.Volunteer;
import Business.WorkQueue.WorkRequest;

/**
 *
 * @author Lintong
 */
public class CourseRequest extends WorkRequest{
    private int ID;
    private static int con;
    private Course course;
    private Volunteer volunteer;
    private Classroom classroom;

    public CourseRequest() {
        this.course= new Course();
        volunteer = new Volunteer();  
        ID=con;
        con++;
    }

    public Volunteer getVolunteer() {
        return volunteer;
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
    
    
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setVolunteer(Volunteer volunteer) {
        this.volunteer = volunteer;
    }
    

    
    
}
