package com.stackroute.domain;

public class Actor {
    private String name, gender;
    private int age;

    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
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
