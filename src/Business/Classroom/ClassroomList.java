/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Classroom;

import java.util.ArrayList;

/**
 *
 * @author Lintong
 */
public class ClassroomList {
    private ArrayList<Classroom>  classroomList;
    public ClassroomList(){
        classroomList = new ArrayList<Classroom>();
        
    }

    public ArrayList<Classroom> getClassroomList() {
        return classroomList;
    }
    public Classroom addClassroom(){
        Classroom cr = new Classroom();
        classroomList.add(cr);
        return cr;
    }
    
}
