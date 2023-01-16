package yvettecodes.example.javasystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import yvettecodes.example.javasystem.model.StudentModel;
import yvettecodes.example.javasystem.service.StudentService;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    private String add(@RequestBody StudentModel studentModel){
        studentService.saveStudent(studentModel);
        return "New student was added";
    }

    @GetMapping("/getAll")
    public List<StudentModel> getAllStudent(){
       return studentService.getAllStudents();
    }


}
