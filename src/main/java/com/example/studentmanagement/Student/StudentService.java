package com.example.studentmanagement.Student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Markos Kebede",
                        LocalDate.of(1998, Month.AUGUST, 23),
                        "Male",
                        "markos@gmail.com",
                        "0912322334",
                        "Markos Teferi",
                        "0978457368",
                        "Adiss Ababa/Bole/04/23"
                )
        );
    }

}
