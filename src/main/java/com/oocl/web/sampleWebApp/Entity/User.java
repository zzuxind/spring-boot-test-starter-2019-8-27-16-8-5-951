package com.oocl.web.sampleWebApp.Entity;

public class User {
    private int userID;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public int getUserID() {
        return userID;
    }

    public User() {
    }

    public User(int userID, String name) {
        this.userID = userID;
        this.name = name;
    }
}
