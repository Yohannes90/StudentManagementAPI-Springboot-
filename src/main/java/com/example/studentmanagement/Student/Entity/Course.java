package com.example.studentmanagement.Student.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Table
public class Course {

    @Id
    @GeneratedValue
    private Long courseId;

    @NotEmpty(message = "Year should be specified")
    @NotNull(message = "Year can not be null")
    @Column(nullable = false)
    private String year;

    @NotEmpty(message = "Semister should be specified")
    @NotNull(message = "Semister can not be null")
    @Column(nullable = false)
    private String semister;


}
