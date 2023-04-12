package com.example.studentmanagement.Student;

//import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import java.time.LocalDate;
//import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path ="api/v1/students")
//@AllArgsConstructor
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class StudentController {

    private final StudentService studentService;

//  @Autowired
//    public StudentController(StudentService studentService) {
//      this.studentService = studentService;
    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getStudents();
    }
}
