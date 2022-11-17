package com.MyManagement.service;

import com.MyManagement.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Student saveStudent(Student student);
}
