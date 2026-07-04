package com.eduflow.student.dto;

import java.time.Instant;
import java.util.UUID;

public record StudentResponse(
        UUID id,
        String admissionNumber,
        String displayName,
        String email,
        Instant createdAt,
        Instant updatedAt
) {
}
