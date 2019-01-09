/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Job;

import java.util.ArrayList;

/**
 *
 * @author Lintong
 */
public class JobList {
    private ArrayList<Job> jobList;
    public JobList(){
        jobList= new ArrayList();
    }

    public ArrayList<Job> getJobList() {
        return jobList;
    }
    
    public Job addJob(){
        Job job=new Job();
        jobList.add(job);
        return job;
    }
    
}
