/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.JobRequests;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.util.Date;

/**
 *
 * @author zhangchi
 */
public class JobRequests extends WorkRequest{
    private int Jobid;
    
    private int JobRequestsID;
    private static int con;
    
    public JobRequests(){
        
        
        this.JobRequestsID = con;
        con++;
    }

    

    
    public int getJobid() {
        return Jobid;
    }

    
    public int getJobRequestsID() {
        return JobRequestsID;
    }

    public void setJobid(int Jobid) {
        this.Jobid = Jobid;
    }

    public void setJobRequestsID(int JobRequestsID) {
        this.JobRequestsID = JobRequestsID;
    }
    
}
