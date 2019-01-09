/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Job;

/**
 *
 * @author Lintong
 */
public class Job {
    private int jobID;
    private String feature;
    private static int count = 1;
    public Job(){
        jobID=count;
        count++;
    }

    public int getJobID() {
        return jobID;
    }

    public void setJobID(int jobID) {
        this.jobID = jobID;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }
    
    
    
    
}
