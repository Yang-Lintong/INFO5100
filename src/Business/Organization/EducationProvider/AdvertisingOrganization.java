/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.EducationProvider;

import Business.Classroom.ClassroomList;

import Business.Organization.Organization;
import Business.Role.JopProvider.HRRole;
import Business.Role.Role;
import Business.WorkRequest.ClassroomRequest.ClassroomRequestHistory;
import Business.WorkRequest.courseRequest.CourseRequestHistory;
import java.util.ArrayList;

/**
 *
 * @author Lintong
 */
public class AdvertisingOrganization extends Organization{
    
    private ClassroomRequestHistory classroomRequets;
    private ClassroomList classroomList;
    private CourseRequestHistory courseRequestHistory;
    
    
    public AdvertisingOrganization() {
        super(Organization.Type.EPAdvertising.getValue());
        classroomRequets = new ClassroomRequestHistory();
        classroomList = new ClassroomList();
        courseRequestHistory = new CourseRequestHistory();
    }

    public ClassroomRequestHistory getClassroomRequets() {
        return classroomRequets;
    }

    public ClassroomList getClassroomList() {
        return classroomList;
    }

    public CourseRequestHistory getCourseRequestHistory() {
        return courseRequestHistory;
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new HRRole());
        return roles;
    }

    
}
