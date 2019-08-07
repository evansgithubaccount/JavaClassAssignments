package com.example.sbpractice.Controllers;

import com.example.sbpractice.Dao.StudentDao;
import com.example.sbpractice.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentDao sDao;

    @RequestMapping(value="/", method = RequestMethod.GET)
    public ArrayList getAllStudents(){
        return sDao.getStudents();
    }

    @RequestMapping(value="/add/{student}", method = RequestMethod.GET)
    public ModelAndView addStudent(@PathVariable("student") String student){
        String[] input = student.split("-");
        String name = input[0];
        int age = Integer.parseInt(input[1]);
        String major = input[2];
        int id = sDao.getStudents().size();
        sDao.addStudent(new Student(name,age,major,id));
        return new ModelAndView("redirect:/");
    }

    @RequestMapping(value="/{major}/students", method = RequestMethod.GET)
    public ArrayList getAllMajorStudents(@PathVariable("major") String s){
        if("SCIENCE MATHS MAGIC".contains(s.toUpperCase())){
            return sDao.getStudentsByGroup(s.toUpperCase());
        }else {
            return sDao.getStudentsByMajor(s.toUpperCase());
        }
    }

}
