package com.learning.cruddemo.dao;

import com.learning.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student theStudent);
    Student findByID(Integer id);
    List<Student> findAll();
    List<Student> findByLastName(String lastName);
    void update(Student theStudent);
    void delete(Integer id);
    int deleteAll();
}
