package com.example.demoSpring.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("students")
public class StudentController {
    private final StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Students> getAllStudents(){
        //throw new ApiRequestException("Oops cannot get all students with custom exception");


        return studentService.getAllStudents();

    }
    @GetMapping(path = "{studentId}/courses")
    public List<StudentCourse> getAllCoursesForStudent(
            @PathVariable("studentId") UUID studentId){
       //TODO
       // System.out.println(studentId);
        return studentService.getAllCoursesForStudent(studentId);
    }
    @PostMapping
    public void addNewStudent(@RequestBody @Validated Students student){
        studentService.addNewStudent(student);
    }

}
