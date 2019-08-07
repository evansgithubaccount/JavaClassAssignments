package com.example.sbpractice.domain;

import java.util.ArrayList;

public class House {
    private String name;
    private int studentCount;
    private ArrayList<Student> students;

    public House(){}
    public House(String name){
        this.name = name;
    }

    public String getName(){return this.name;}
    public void setName(String name){this.name=name;}

    public int getStudentCount(){
        this.studentCount = students.size();
        return this.studentCount;
    }

    public void addStudent(Student s){students.add(s);studentCount++;}
    public ArrayList<Student> getStudents(){return students;}
}
