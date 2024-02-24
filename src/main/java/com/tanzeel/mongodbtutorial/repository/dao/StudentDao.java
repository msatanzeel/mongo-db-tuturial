package com.tanzeel.mongodbtutorial.repository.dao;

import com.tanzeel.mongodbtutorial.repository.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentDao extends MongoRepository<Student, Long> {
    Student save(Student student);
    Optional<Student> findById(Long id);
    List<Student> findAll();
    void deleteById(Long id);
    void deleteAll();
    long count();
    boolean existsById(Long id);
    List<Student> findByFirstName(String firstName);
    List<Student> findByLastName(String lastName);
    List<Student> findByEmail(String email);

}
