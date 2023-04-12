package com.example.studentmanagement.Student;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table
@Data
public class Student {

    @Id
    @SequenceGenerator(
            name = "students sequence",
            sequenceName = "students sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "students_sequence"
    )
    private Long studentId;
    private String studentName;
    private LocalDate dateOfBirth;
    private String gender;
    private String email;
    private String phoneNumber;
    private String emergencyContactName;
    private String emergencyContactNumber;
    private String address;
}
