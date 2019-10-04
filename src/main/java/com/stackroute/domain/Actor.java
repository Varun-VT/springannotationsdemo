package com.stackroute.domain;

public class Actor {
    private String name, gender;
    private int age;

    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
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
