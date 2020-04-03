package com.example.thirdlab;

public class Contact {
    int id;
    String name;
    String middleName;
    String lastName;
    String date;

    public Contact() {

    }

    public Contact(String name,String middleName,String lastName, String date) {
        this.name = name;
        this.middleName=middleName;
        this.lastName=lastName;
        this.date = date;
    }

    public Contact(int id, String name,String middleName,String lastName, String date) {
        this.id = id;
        this.name = name;
        this.middleName=middleName;
        this.lastName=lastName;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


}
