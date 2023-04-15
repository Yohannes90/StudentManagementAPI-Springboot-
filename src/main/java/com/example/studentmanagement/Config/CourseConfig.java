package com.example.studentmanagement.Config;

import com.example.studentmanagement.Entity.Course;
import com.example.studentmanagement.Repositories.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CourseConfig {

    @Bean
    public CommandLineRunner commandLineRunner(CourseRepository courseRepository) {
        return args -> {
            Course markos = new Course(
                    1L,
                    "1",
                    "2",
                    "computer science",
                    "Algebra",
                    "Algebra",
                    "Algebra",
                    "Algebra",
                    "Algebra"
                    );
                    courseRepository.saveAll(
                            List.of(markos)
                    );
        };
    }
}
