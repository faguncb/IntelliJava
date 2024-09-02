package org.example;

public class Person {

    private String name;
    private String email;
    private String phoneNumber;

    public Person(String theName){
        this.name = theName;
    }

    public String getName() { return this.name;}
    public String getEmail() { return this.email;}
    public String getPhoneNumber() { return this.phoneNumber;}

    public void setName(String theName) { this.name = theName;}
    public void setEmail(String theEmail) { this.email = theEmail;}
    public void setPhoneNumber(String thePhoneNumber) { this.phoneNumber = thePhoneNumber;}

    public String toString()
    {
        return this.name + " " + this.email + " " + this.phoneNumber + " ";
    }



}
