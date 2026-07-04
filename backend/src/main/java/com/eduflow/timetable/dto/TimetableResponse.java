package com.eduflow.timetable.dto;

import java.time.Instant;
import java.util.UUID;

public record TimetableResponse(
        UUID id,
        String code,
        String name,
        String academicYear,
        Instant createdAt,
        Instant updatedAt
) {
}
