package com.ranindu.studentsys.service;

import com.ranindu.studentsys.model.Student;

import java.util.List;

public interface StudentService {

    public Student saveStudent(Student student);
public List<Student> getAllStudents();

}
