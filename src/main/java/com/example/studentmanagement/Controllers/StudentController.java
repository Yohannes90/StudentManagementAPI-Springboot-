package com.example.studentmanagement.Controllers;

import com.example.studentmanagement.Entity.Student;
import com.example.studentmanagement.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path ="api/v1/students")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getStudents();
    }

    @PostMapping
    public void registerNewStudent(@RequestBody Student student) {
        studentService.addNewStudent(student);
    }

    @DeleteMapping(path = "{studentId}")
    public void DeleteStudent(@PathVariable("studentId") Long studentId) {
        studentService.deleteStudent(studentId);
    }

    @PutMapping(path= "{studentId}")
    public void updateStudent(@PathVariable("studentId") Long studentId,
                               @RequestParam(required = false) String studentName,
                               @RequestParam(required = false) String gender,
                               @RequestParam(required = false) LocalDate dateOfBirth,
                               @RequestParam(required = false) String phoneNumber,
                               @RequestParam(required = false) String email,
                               @RequestParam(required = false) String homeAddress,
                               @RequestParam(required = false) String emergencyContactName,
                               @RequestParam(required = false) String emergencyContactNumber) {
        studentService.updateStudent(studentId, studentName, gender, dateOfBirth, phoneNumber,
                email, homeAddress, emergencyContactName, emergencyContactNumber);
    }

}
