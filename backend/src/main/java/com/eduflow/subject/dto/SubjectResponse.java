package com.eduflow.subject.dto;

import java.time.Instant;
import java.util.UUID;

public record SubjectResponse(
        UUID id,
        String code,
        String name,
        String department,
        Instant createdAt,
        Instant updatedAt
) {
}
