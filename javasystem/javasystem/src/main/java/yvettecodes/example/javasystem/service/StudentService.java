package yvettecodes.example.javasystem.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yvettecodes.example.javasystem.model.StudentModel;
import yvettecodes.example.javasystem.repo.StudentRepository;

import java.util.List;

@Service
public class StudentService implements StudentServiceImplementation {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<StudentModel> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public StudentModel saveStudent(StudentModel studentModel) {
        return studentRepository.save(studentModel);

    }

}
