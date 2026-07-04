package com.eduflow.section.dto;

import java.time.Instant;
import java.util.UUID;

public record SectionResponse(
        UUID id,
        String code,
        String name,
        String capacity,
        Instant createdAt,
        Instant updatedAt
) {
}
