package com.example.sbpractice.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    private Major major;

    public Student(){}
    public Student(String name, int age, String major){
        this.name = name;
        this.age = age;
        this.major = new Major(major);
    }
    public Student(String name, int age, String major, int id){
        this.name = name;
        this.age = age;
        this.major = new Major(major);
        this.id = id;
    }

    public int getId() {return id;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    public Major getMajor() {return major;}
    public void setMajor(String major) {this.major.setName(major);}

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", major=" + major +
                '}';
    }
}
