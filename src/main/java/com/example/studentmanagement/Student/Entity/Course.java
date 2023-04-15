package com.example.studentmanagement.Student.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
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

    @Column(nullable = false)
    private String course1;

    @Column(nullable = false)
    private String course2;

    @Column(nullable = false)
    private String course3;

    @Column(nullable = false)
    private String course4;

    @Column(nullable = false)
    private String course5;

    @Column(nullable = false)
    private String course6;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_student_id")
    private Student student;
}
