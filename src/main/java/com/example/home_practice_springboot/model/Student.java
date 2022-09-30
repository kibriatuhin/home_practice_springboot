package com.example.home_practice_springboot.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.inject.Named;
import java.beans.ConstructorProperties;
import java.util.List;


@Component
@Primary
public class Student {


    private int id;

    private String name;


    private float cgpa;


    //dependency injection

    private Address address;
    private List<Courses> courses;


    public Student() {
    }



    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    public List<Courses> getCourses() {
        return courses;
    }

    public void setCourses(List<Courses> courses) {
        this.courses = courses;
    }

    public Student(int id, String name, float cgpa, Address address) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
        this.address = address;

    }

    /*  public static Student getInstance(Address address, Courses courses) {
      Student ob = new Student();
      ob.setAddress(address);
      ob.setCourses(courses);
      return ob;

    }*/

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
                ", courses=" + courses +
                '}';
    }
}
