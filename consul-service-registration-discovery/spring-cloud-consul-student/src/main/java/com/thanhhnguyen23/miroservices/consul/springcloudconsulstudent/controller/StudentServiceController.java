package com.thanhhnguyen23.miroservices.consul.springcloudconsulstudent.controller;

import com.thanhhnguyen23.miroservices.consul.springcloudconsulstudent.domain.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class StudentServiceController {
    private static Map<String, List<Student>> schooDB = new HashMap<String, List<Student>>();


    static{
        schooDB = new HashMap<String, List<Student>>();


        List<Student> lst = new ArrayList<>();

        Student std = new Student("Thanh", "Class I");
        lst.add(std);

        std = new Student ("Cindy", "Class II");
        lst.add(std);

        schooDB.put("abcschool", lst);

        lst = new ArrayList<>();
        std = new Student("Bob", "Class III");
        lst.add(std);
        std = new Student("Mark", "Class VI");
        lst.add(std);

        schooDB.put("xyzschool", lst);

    }

    @RequestMapping(value = "/getStudentDetailsForSchool/{schoolname}", method = RequestMethod.GET)
    public List<Student> getStudents(@PathVariable String schoolname) {
        System.out.println("Getting Student details for " + schoolname);

        List<Student> studentList = schooDB.get(schoolname);
        if (studentList == null) {
            studentList = new ArrayList<Student>();
            Student std = new Student("Not Found", "N/A");
            studentList.add(std);
        }
        return studentList;
    }
}
