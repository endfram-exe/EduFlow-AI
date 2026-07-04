package com.eduflow.teacher.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record TeacherRequest(
        @NotBlank @Size(max = 80) String employeeCode,
        @NotBlank @Size(max = 160) String displayName,
        @NotBlank @Size(max = 160) String email
) {
}
