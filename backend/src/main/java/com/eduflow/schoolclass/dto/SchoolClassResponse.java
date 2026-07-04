package com.eduflow.schoolclass.dto;

import java.time.Instant;
import java.util.UUID;

public record SchoolClassResponse(
        UUID id,
        String code,
        String name,
        String gradeBand,
        Instant createdAt,
        Instant updatedAt
) {
}
