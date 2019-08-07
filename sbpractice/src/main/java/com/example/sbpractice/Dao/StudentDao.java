package com.example.sbpractice.Dao;

import com.example.sbpractice.domain.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Map;

@Repository
public class StudentDao {
    private ArrayList<Student> students;

    public StudentDao(){
        students = new ArrayList<>();
        students.add(new Student("Hermione",15,"Maths"));
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public ArrayList getStudents(){
        return students;
    }

    public ArrayList getStudentsByMajor(String major){
        ArrayList<Student> majorStudents = new ArrayList<>();
        for(Student s : students){
            if(s.getMajor().getName().equals(major)){
                majorStudents.add(s);
            }
        }
        return majorStudents;
    }

    public ArrayList getStudentsByGroup(String major){
        ArrayList<Student> majorStudents = new ArrayList<>();
        for(Student s : students){
            if(s.getMajor().getSubjectGroup().equals(major.toUpperCase())){
                majorStudents.add(s);
            }
        }
        return majorStudents;
    }
}
