package com.eduflow.ai.dto;

import java.time.Instant;
import java.util.UUID;

public record AiAssistantProfileResponse(
        UUID id,
        String code,
        String name,
        String modelProvider,
        Instant createdAt,
        Instant updatedAt
) {
}
