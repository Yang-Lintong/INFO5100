/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import java.util.ArrayList;

/**
 *
 * @author Lintong
 */
public class VolunteerDirectory {
    private ArrayList<Volunteer>  volunteerDirectory;

    public VolunteerDirectory() {
      volunteerDirectory = new   ArrayList<Volunteer>(); 
    }

    public ArrayList<Volunteer> getVolunteerDirectory() {
        return volunteerDirectory;
    }
    public Volunteer addVolunteer(){
        Volunteer vt= new Volunteer();
        volunteerDirectory.add(vt);
        return vt;
    }
    public void deleteVolunteer(Volunteer vt){
        volunteerDirectory.remove(vt);
    }
}
