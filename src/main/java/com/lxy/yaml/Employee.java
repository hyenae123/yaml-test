package com.lxy.yaml;

public class Employee {
    private String id;
    private String name;
    private String phoneNumber;
    
    public Employee() {
        super();
    }
    
    public Employee(String id, String name, String phoneNumber) {
        super();
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}