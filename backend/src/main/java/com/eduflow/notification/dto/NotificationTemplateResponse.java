package com.eduflow.notification.dto;

import java.time.Instant;
import java.util.UUID;

public record NotificationTemplateResponse(
        UUID id,
        String code,
        String name,
        String channel,
        Instant createdAt,
        Instant updatedAt
) {
}
