package com.example.studentmanagement.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table
public class Course {

    public Course(Student student, String year, String semister, String course1, String course2, String course3, String course4, String course5, String course6) {
        this.student = student;
        this.year = year;
        this.semister = semister;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.course4 = course4;
        this.course5 = course5;
        this.course6 = course6;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_student_id")
    private Student student;

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

}
