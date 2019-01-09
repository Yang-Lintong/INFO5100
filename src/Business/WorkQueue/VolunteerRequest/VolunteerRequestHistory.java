/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue.VolunteerRequest;

import java.util.ArrayList;

/**
 *
 * @author Lintong
 */
public class VolunteerRequestHistory {
    private ArrayList<VolunteerRequest>  volunteerRequestHistory;

    public VolunteerRequestHistory() {
        volunteerRequestHistory = new  ArrayList<VolunteerRequest>(); 
    }

    public ArrayList<VolunteerRequest> getVolunteerRequestHistory() {
        return volunteerRequestHistory;
    }
    public VolunteerRequest addVolunteerRequest(){
        VolunteerRequest vr = new VolunteerRequest();
        volunteerRequestHistory.add(vr);
        return vr;
    }
    
    
}
