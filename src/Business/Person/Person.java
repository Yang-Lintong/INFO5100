/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author zhangchi
 */
public abstract class Person {
    private String Firstname;
    private String Lastname;
    private String PhoneNum;
    private String Email;
    private Date DateofBirth;
    private static int counter;
    private int PersonID;
    private UserAccount userAccount;
    
    public enum Type{
        Employee("Employee Person"),Volunteer("Volunteer Person"),Customer("Customer Person");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    public Person(String Lastname){
        this.Lastname = Lastname;
        this.Firstname = new String();
        this.Email = new String();
        this.PhoneNum = new String();
        this.DateofBirth = new Date();
        this.PersonID = counter;
        this.userAccount = new UserAccount();
        ++counter;
}

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
    
    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    public String getPhoneNum() {
        return PhoneNum;
    }

    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Date getDateofBirth() {
        return DateofBirth;
    }

    public void setDateofBirth(Date DateofBirth) {
        this.DateofBirth = DateofBirth;
    }

    public int getPersonID() {
        return PersonID;
    }
    
}
