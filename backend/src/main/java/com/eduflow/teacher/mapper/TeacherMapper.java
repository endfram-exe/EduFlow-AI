package com.eduflow.teacher.mapper;

import com.eduflow.teacher.domain.Teacher;
import com.eduflow.teacher.dto.TeacherRequest;
import com.eduflow.teacher.dto.TeacherResponse;
import org.springframework.stereotype.Component;

@Component
public class TeacherMapper {

    public Teacher toEntity(TeacherRequest request) {
        return Teacher.builder()
                .employeeCode(request.employeeCode())
                .displayName(request.displayName())
                .email(request.email())
                .build();
    }

    public TeacherResponse toResponse(Teacher teacher) {
        return new TeacherResponse(
                teacher.getId(),
                teacher.getEmployeeCode(),
                teacher.getDisplayName(),
                teacher.getEmail(),
                teacher.getCreatedAt(),
                teacher.getUpdatedAt()
        );
    }
}
