/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Sponsor;

import Business.Classroom.ClassroomList;

import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.Sponsor.AdvertisingRole;
import Business.WorkRequest.ClassroomRequest.ClassroomRequestHistory;
import Business.WorkRequest.courseRequest.CourseRequestHistory;

import java.util.ArrayList;


/**
 *
 * @author Lintong
 */
public class SponsorAdvertisingOrganization extends Organization{
    private ClassroomRequestHistory classroomRequestHistory;
    private ClassroomList classroomList;
    private CourseRequestHistory courseRequestHistory;
    public SponsorAdvertisingOrganization() {
        super(Organization.Type.SpAdvertising.getValue());
        classroomRequestHistory = new ClassroomRequestHistory();
        courseRequestHistory = new CourseRequestHistory();
        
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new  AdvertisingRole());
        return roles;
    }

    public ClassroomRequestHistory getClassroomRequestHistory() {
        return classroomRequestHistory;
    }

    public ClassroomList getClassroomList() {
        return classroomList;
    }

    public CourseRequestHistory getCourseRequestHistory() {
        return courseRequestHistory;
    }
    
    
}
