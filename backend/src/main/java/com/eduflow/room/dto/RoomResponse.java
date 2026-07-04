package com.eduflow.room.dto;

import java.time.Instant;
import java.util.UUID;

public record RoomResponse(
        UUID id,
        String code,
        String name,
        String building,
        Instant createdAt,
        Instant updatedAt
) {
}
