package com.example.home_practice_springboot;

class DBService{
    public void save(){
        //save
    }
}

public class MainMethod {
    DBService service;
    public static void main(String[] args) {
        MainMethod ob = new MainMethod();
        ob.operation();
    }
    public void operation(){
        service.save();
    }
}
