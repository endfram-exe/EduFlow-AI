package com.eduflow.constraint.dto;

import java.time.Instant;
import java.util.UUID;

public record SchedulingConstraintResponse(
        UUID id,
        String code,
        String name,
        String constraintType,
        Instant createdAt,
        Instant updatedAt
) {
}
