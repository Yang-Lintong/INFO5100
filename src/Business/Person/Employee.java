/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

/**
 *
 * @author zhangchi
 */
public class Employee extends Person {
    private int EmployeeID;
    private static int counter;
    public Employee() {
        super(Person.Type.Employee.getValue());
        this.EmployeeID = counter;
        counter++;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }
    
    
}
