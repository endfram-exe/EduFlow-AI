package com.eduflow.substitute.dto;

import java.time.Instant;
import java.util.UUID;

public record SubstituteResponse(
        UUID id,
        String code,
        String name,
        String assignmentScope,
        Instant createdAt,
        Instant updatedAt
) {
}
