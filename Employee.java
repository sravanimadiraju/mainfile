package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name="employee profile system")

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public Long id;
    public String Firstname;
    public String Lastname;
    public String DOB;
    public String DOJ;
    public String email;
    public String mobile;
    public Float salary;

    public Employee(){};

    public Employee(Long id, String firstname, String lastname, String DOB, String DOJ, String email, String mobile, Float salary) {
        this.id = id;
        Firstname = firstname;
        Lastname = lastname;
        this.DOB = DOB;
        this.DOJ = DOJ;
        this.email = email;
        this.mobile = mobile;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getDOJ() {
        return DOJ;
    }

    public void setDOJ(String DOJ) {
        this.DOJ = DOJ;
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

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }
}