package com.tanzeel.mongodbtutorial.controller;

import com.tanzeel.mongodbtutorial.repository.entity.Student;
import com.tanzeel.mongodbtutorial.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    private StudentServiceImpl studentServiceImpl;

    @Autowired
    public void setStudentServiceImpl(StudentServiceImpl studentServiceImpl) {
        this.studentServiceImpl = studentServiceImpl;
    }
    @PostMapping ("/student")
    public void addStudent(Student student) {
        studentServiceImpl.save(student);
    }

    @GetMapping("/student/{studentEmail}")
    public List<Student> getStudent(@PathVariable("studentEmail") String studentEmail) {
        return studentServiceImpl.getStudentByEmail(studentEmail);
    }

}
