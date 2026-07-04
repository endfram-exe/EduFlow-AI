package com.eduflow.teacher.dto;

import java.time.Instant;
import java.util.UUID;

public record TeacherResponse(
        UUID id,
        String employeeCode,
        String displayName,
        String email,
        Instant createdAt,
        Instant updatedAt
) {
}
