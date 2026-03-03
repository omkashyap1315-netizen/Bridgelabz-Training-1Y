package com.gla.Java_Packages.Library.Members;


public class Members {
    private String name;
    private int memberId;

    public Members(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public void displayMember() {
        System.out.println("Member Name: " + name);
        System.out.println("Member ID: " + memberId);
    }

    public String getName() {
        return name;
    }
}
