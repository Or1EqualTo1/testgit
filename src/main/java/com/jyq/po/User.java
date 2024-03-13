package com.jyq.po;

import java.util.Date;

public class User {
    private int id;
    private String name;
    private int age;
    private String address;
    private Date regDate;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", regDate=" + regDate +
                '}';
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public User() {
    }

    public User(int id, String name, int age, String address, Date regDate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.regDate = regDate;
    }
}
