package com.example.studentmanagement.Student;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;


@Data
@NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "students")
public class Student {
    public Student(String studentName, String gender,
                   LocalDate dateOfBirth, String phoneNumber,
                   String email, String homeAddress, String emergencyContactName,
                   String emergencyContactNumber) {
        this.studentName = studentName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.homeAddress = homeAddress;
        this.emergencyContactName = emergencyContactName;
        this.emergencyContactNumber = emergencyContactNumber;
    }

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

    @NotEmpty(message = "Student name is required")
    @NotNull(message = "Student name can not be null")
    @Column(nullable = false)
    private String studentName;

    @NotEmpty(message = "Student gender is required")
    @Column(nullable = false)
    private String gender;

    @NotNull(message = "Please enter date of birth")
    @Past(message = "Birth date should be less than current date!")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dateOfBirth;

    @NotEmpty(message = "Phone number is required")
    @NotNull(message = "Phone number can not be null")
    @Size(max = 13, min = 10, message = "Mobile number should be of 10 digits")
    @Column(nullable = false, unique = true)
    private String phoneNumber;

    @NotEmpty(message = "email is required")
    @Email
    @Column(nullable = false, unique = true)
    private String email;

    @NotEmpty(message = "Address is required")
    @NotNull(message = "Address can not be null")
    @Column(nullable = false)
    private String homeAddress;

    @NotEmpty(message = "Emergency Contact Name is required")
    @NotNull(message = "Emergency Contact Name can not be null")
    @Column(nullable = false)
    private String emergencyContactName;

    @NotEmpty(message = "Phone number is required")
    @NotNull(message = "Phone number can not be null")
    @Size(max = 13, min = 10, message = "Mobile number should be of 10 digits")
    @Column(nullable = false)
    private String emergencyContactNumber;

}
