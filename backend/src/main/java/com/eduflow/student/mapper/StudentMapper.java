package com.eduflow.student.mapper;

import com.eduflow.student.domain.Student;
import com.eduflow.student.dto.StudentRequest;
import com.eduflow.student.dto.StudentResponse;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {

    public Student toEntity(StudentRequest request) {
        return Student.builder()
                .admissionNumber(request.admissionNumber())
                .displayName(request.displayName())
                .email(request.email())
                .build();
    }

    public StudentResponse toResponse(Student student) {
        return new StudentResponse(
                student.getId(),
                student.getAdmissionNumber(),
                student.getDisplayName(),
                student.getEmail(),
                student.getCreatedAt(),
                student.getUpdatedAt()
        );
    }
}
