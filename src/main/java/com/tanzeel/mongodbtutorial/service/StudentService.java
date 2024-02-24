package com.tanzeel.mongodbtutorial.service;

import com.tanzeel.mongodbtutorial.repository.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    Student save(Student student);
    Optional<Student> findById(Long id);
    List<Student> findAll();
    void deleteById(Long id);
    void deleteAll();
    long count();
    boolean existsById(Long id);
    List<Student> findByFirstName(String firstName);
    List<Student> findByLastName(String lastName);
    List<Student> getStudentByEmail(String email);

}
