package com.itssnico.studentsystem.service;

import com.itssnico.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents(); //Essa é a parte adicionada
}