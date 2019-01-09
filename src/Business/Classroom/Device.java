/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Classroom;

/**
 *
 * @author Lintong
 */
public class Device {
    private static int con;
    private int ID;
    private String name;
    private Boolean useness; //是否可用
    public Device(){
        ID = con;
        con++;
        
    }

    public int getID() {
        return ID;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getUseness() {
        return useness;
    }

    public void setUseness(Boolean useness) {
        this.useness = useness;
    }
    
    
    
}
