package com.example.home_practice_springboot.model;

import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;


public class Student {
    private int id;
    private String name;
    private float cgpa;


    //dependency injection
    private Address address;
    private Courses courses;


    public Student() {
    }



    public Student(int id, String name, float cgpa , Address address) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
        this.address= address;
        System.out.println("Student class constructor call..");
    }

    public Student(Address address, Courses courses) {
        this.address = address;
        this.courses = courses;
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

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public void init(){
        System.out.println("student class init method call..");
    }

    public void destroy(){
        System.out.println("student class destroy  method call..");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cgpa=" + cgpa +
                ", address=" + address +
                '}';
    }
}
