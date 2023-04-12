package com.example.studentmanagement.Student;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student) {
        studentRepository.save(student);
    }

    public void deleteStudent(Long studentId) {
        boolean exists = studentRepository.existsById(studentId);
        if (!exists) {
            throw new IllegalStateException("Student with id number " + studentId + " doesn't exist!");
        }
        studentRepository.deleteById(studentId);
    }

    @Transactional
    public void updateStudent(Long studentId, String studentName, String gender, LocalDate dateOfBirth, String phoneNumber,
                              String email, String homeAddress, String emergencyContactName,
                              String emergencyContactNumber) {

        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new IllegalStateException("Student with id number " + studentId + " doesn't exist!"));

        if (!Objects.equals(student.getStudentName(), studentName)) {
            student.setStudentName(studentName);
        }
        if (!Objects.equals(student.getGender(), gender)) {
            student.setGender(gender);
        }
        if (!Objects.equals(student.getDateOfBirth(), dateOfBirth)) {
            student.setDateOfBirth(dateOfBirth);
        }
        if (!Objects.equals(student.getPhoneNumber(), phoneNumber)) {
            student.setPhoneNumber(phoneNumber);
        }
        if (!Objects.equals(student.getEmail(), email)) {
            student.setEmail(email);
        }
        if (!Objects.equals(student.getHomeAddress(), homeAddress)) {
            student.setHomeAddress(homeAddress);
        }
        if (!Objects.equals(student.getEmergencyContactName(), emergencyContactName)) {
            student.setEmergencyContactName(emergencyContactName);
        }
        if (!Objects.equals(student.getEmergencyContactNumber(), emergencyContactNumber)) {
            student.setEmergencyContactNumber(emergencyContactNumber);
        }
    }

}
