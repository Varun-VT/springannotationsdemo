package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Actor {

    private String name;
    private String gender;
    private int age;

    public Actor() {
    }

    @Autowired
    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }



    public void setAge(int age) {
        this.age = age;
    }


    public void init(){
        System.out.println("Actor Bean is initiated");
    }

    public void destroy(){
        System.out.println("Actor Bean will destroy now");
    }

    @Override
    public String toString() {
        return name + " "+ age+ " "+ gender;
    }

}
