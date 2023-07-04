package com.itssnico.studentsystem.service;

import com.itssnico.studentsystem.model.Student;
import com.itssnico.studentsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService{
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override //Essa é a parte adicionada
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}