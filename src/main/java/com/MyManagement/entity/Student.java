package com.MyManagement.entity;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name",nullable = false)
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "regd_no",nullable = false)
    private String rollNo;
    @Column(name = "email",nullable = false)
    private String email;
    private String mobile;

    public Student() {
    }

    public Student(Long id, String firstName, String lastName, String rollNo, String email, String mobile) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.rollNo = rollNo;
        this.email = email;
        this.mobile = mobile;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}