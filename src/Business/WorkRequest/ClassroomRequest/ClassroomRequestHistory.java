/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequest.ClassroomRequest;

import java.util.ArrayList;

/**
 *
 * @author Lintong
 */
public class ClassroomRequestHistory {
    
    private ArrayList<ClassroomRequest>  classroomRequestHistory;
    public ClassroomRequestHistory(){
        classroomRequestHistory = new ArrayList<ClassroomRequest>();
        
    }

    public ArrayList<ClassroomRequest> getClassroomRequestHistory() {
        return classroomRequestHistory;
    }
    
    public ClassroomRequest addClassroomRequest(){
        ClassroomRequest cr = new ClassroomRequest();
        classroomRequestHistory.add(cr);
        return cr;
    }
    
    
}
