/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.EducationProvider;

import Business.Class.CourseList;
import Business.Organization.Organization;
import Business.Person.VolunteerDirectory;
import Business.Role.EducationProvider.AssignVolunteerRole;
import Business.Role.JopProvider.HRRole;
import Business.Role.Role;
import Business.WorkRequest.courseRequest.CourseRequestHistory;
import java.util.ArrayList;

/**
 *
 * @author Lintong
 */
public class AssignVolunteerOrganization extends Organization{
    
     private VolunteerDirectory volunteerDirectory;
     private CourseList courseList;
     private CourseRequestHistory courseRequestHistory;
    
     public AssignVolunteerOrganization() {
        super(Organization.Type.AssignVolunteer.getValue());
        volunteerDirectory = new VolunteerDirectory();
        courseList = new CourseList();
        courseRequestHistory = new CourseRequestHistory();
        
     }

    public VolunteerDirectory getVolunteerDirectory() {
        return volunteerDirectory;
    }

    public CourseList getCourseList() {
        return courseList;
    }

    public CourseRequestHistory getCourseRequestHistory() {
        return courseRequestHistory;
    }
    
     
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AssignVolunteerRole());
        return roles;
    }
    
}
