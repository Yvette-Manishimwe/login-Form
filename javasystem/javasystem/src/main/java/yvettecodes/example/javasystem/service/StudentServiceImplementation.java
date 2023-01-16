package yvettecodes.example.javasystem.service;


import yvettecodes.example.javasystem.model.StudentModel;

import java.util.List;


public interface StudentServiceImplementation {
    public StudentModel saveStudent(StudentModel studentModel);
    public List<StudentModel> getAllStudents();

}
