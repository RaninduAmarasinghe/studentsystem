package com.ranindu.studentsys.service;

import com.ranindu.studentsys.model.Student;
import com.ranindu.studentsys.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
@Autowired
private StudentRepository studentRepository;
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

}
