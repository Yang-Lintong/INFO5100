/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import java.util.ArrayList;
import Business.Person.Person.Type;
/**
 *
 * @author zhangchi
 */
public class PersonDirectory {
    private ArrayList<Person> personList;

    public PersonDirectory() {
        personList = new ArrayList<>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }
    
    public Person createPerson(Type type){
        Person person = null;
        if (type.getValue().equals(Type.Employee.getValue())){
            person = new Employee();
            personList.add(person);
        }
        else if (type.getValue().equals(Type.Volunteer.getValue())){
            person = new Volunteer();
            personList.add(person);
        }
        else if (type.getValue().equals(Type.Customer.getValue())){
            person = new Customer();
            personList.add(person);
        }
        return person;
    }
}
