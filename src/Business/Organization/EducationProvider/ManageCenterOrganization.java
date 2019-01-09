/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.EducationProvider;


import Business.Organization.Organization;
import Business.Role.EducationProvider.ManageCenterRole;
import Business.Role.Role;
import Business.WorkQueue.VolunteerRequest.VolunteerRequestHistory;
import Business.WorkRequest.ClassroomRequest.ClassroomRequestHistory;
import Business.WorkRequest.courseRequest.CourseRequestHistory;
import java.util.ArrayList;

/**
 *
 * @author Lintong
 */
public class ManageCenterOrganization extends Organization{
    
    private CourseRequestHistory courseRequestHistory;
    private VolunteerRequestHistory volunteerRequestHistory;
    private ClassroomRequestHistory classroomRequestHistory;

    public ManageCenterOrganization(String name) {
        super(Organization.Type.ManageCenter.getValue());
        courseRequestHistory = new CourseRequestHistory();
        volunteerRequestHistory = new VolunteerRequestHistory();
        classroomRequestHistory = new ClassroomRequestHistory();
    }

    public CourseRequestHistory getCourseRequestHistory() {
        return courseRequestHistory;
    }

    public VolunteerRequestHistory getVolunteerRequestHistory() {
        return volunteerRequestHistory;
    }

    public ClassroomRequestHistory getClassroomRequestHistory() {
        return classroomRequestHistory;
    }
    
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ManageCenterRole());
        return roles;
    }

}
