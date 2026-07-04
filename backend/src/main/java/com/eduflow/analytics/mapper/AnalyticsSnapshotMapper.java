package com.eduflow.analytics.mapper;

import com.eduflow.analytics.domain.AnalyticsSnapshot;
import com.eduflow.analytics.dto.AnalyticsSnapshotRequest;
import com.eduflow.analytics.dto.AnalyticsSnapshotResponse;
import org.springframework.stereotype.Component;

@Component
public class AnalyticsSnapshotMapper {

    public AnalyticsSnapshot toEntity(AnalyticsSnapshotRequest request) {
        return AnalyticsSnapshot.builder()
                .code(request.code())
                .name(request.name())
                .metricGroup(request.metricGroup())
                .build();
    }

    public AnalyticsSnapshotResponse toResponse(AnalyticsSnapshot analyticsSnapshot) {
        return new AnalyticsSnapshotResponse(
                analyticsSnapshot.getId(),
                analyticsSnapshot.getCode(),
                analyticsSnapshot.getName(),
                analyticsSnapshot.getMetricGroup(),
                analyticsSnapshot.getCreatedAt(),
                analyticsSnapshot.getUpdatedAt()
        );
    }
}
