package com.tanzeel.mongodbtutorial.service;

import com.tanzeel.mongodbtutorial.repository.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentServiceImplTest {

    StudentServiceImpl studentServiceImpl;

    @Autowired
    public void setStudentServiceImpl(StudentServiceImpl studentServiceImpl) {
        this.studentServiceImpl = studentServiceImpl;
    }

    @Test
    void save() {
        Student studentToSave = Student.builder()
                .firstName("John")
                .lastName("Doe")
                .email("john@example.com")
                .build();
        this.studentServiceImpl.save(studentToSave);
    }

    @Test
    void findAll() {
        List<Student> students = this.studentServiceImpl.findAll();
        System.out.println("List of students is as follows: " + students);
    }
}