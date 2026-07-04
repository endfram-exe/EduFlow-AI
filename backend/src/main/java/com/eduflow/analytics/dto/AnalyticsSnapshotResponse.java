package com.eduflow.analytics.dto;

import java.time.Instant;
import java.util.UUID;

public record AnalyticsSnapshotResponse(
        UUID id,
        String code,
        String name,
        String metricGroup,
        Instant createdAt,
        Instant updatedAt
) {
}
