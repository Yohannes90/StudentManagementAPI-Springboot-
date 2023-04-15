package com.example.studentmanagement.Student.Config;

import com.example.studentmanagement.Entity.Student;
import com.example.studentmanagement.Repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student markos = new Student(
                    "Markos Kebede",
                    "Male",
                        LocalDate.of(1998, Month.AUGUST, 23),
                    "0912322334",
                    "markos@gmail.com",
                    "Adiss Ababa/Bole/04/23",
                    "Abebe Teferi",
                    "0978457368"
            );
            Student meron = new Student(
                    "Meron Leul",
                    "Female",
                        LocalDate.of(2000, Month.AUGUST, 23),
                    "0941237334",
                    "meron@gmail.com",
                    "Adiss Ababa/Bole/06/13",
                    "Leul Mekonnen",
                    "0978457368"
            );
            studentRepository.saveAll(
                List.of(markos, meron)
            );
        };
    }

}
