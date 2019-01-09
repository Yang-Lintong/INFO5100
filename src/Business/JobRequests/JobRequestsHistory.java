/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.JobRequests;

import java.util.ArrayList;

/**
 *
 * @author zhangchi
 */
public class JobRequestsHistory {
    private ArrayList<JobRequests> jobrequestlist;
    public JobRequestsHistory(){
        this.jobrequestlist = new ArrayList();
    }
    public ArrayList<JobRequests> getJobrequestlist() {
        return jobrequestlist;
    }

    public void setJobrequestlist(ArrayList<JobRequests> jobrequestlist) {
        this.jobrequestlist = jobrequestlist;
    }
    
    public JobRequests addJobRequest(int Jobid){
        JobRequests jobrequests = new JobRequests();
        jobrequests.setJobid(Jobid);
        jobrequestlist.add(jobrequests);
        return jobrequests;
    }
}
