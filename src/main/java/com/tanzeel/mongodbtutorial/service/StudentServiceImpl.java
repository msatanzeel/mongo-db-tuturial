package com.tanzeel.mongodbtutorial.service;

import com.tanzeel.mongodbtutorial.repository.dao.StudentDao;
import com.tanzeel.mongodbtutorial.repository.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{
    private final StudentDao studentDao;

    @Autowired
    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public Student save(Student student) {
        return studentDao.save(student);
    }

    @Override
    public Optional<Student> findById(Long id) {
        return studentDao.findById(id);
    }

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }

    @Override
    public void deleteById(Long id) {
        studentDao.deleteById(id);
    }

    @Override
    public void deleteAll() {
        studentDao.deleteAll();
    }

    @Override
    public long count() {
        return studentDao.count();
    }

    @Override
    public boolean existsById(Long id) {
        return studentDao.existsById(id);
    }

    @Override
    public List<Student> findByFirstName(String firstName) {
        return studentDao.findByFirstName(firstName);
    }

    @Override
    public List<Student> findByLastName(String lastName) {
        return studentDao.findByLastName(lastName);
    }

    @Override
    public List<Student> getStudentByEmail(String email) {
        return studentDao.findByEmail(email);
    }

}
