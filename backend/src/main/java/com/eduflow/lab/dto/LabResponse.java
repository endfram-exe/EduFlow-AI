package com.eduflow.lab.dto;

import java.time.Instant;
import java.util.UUID;

public record LabResponse(
        UUID id,
        String code,
        String name,
        String specialization,
        Instant createdAt,
        Instant updatedAt
) {
}
