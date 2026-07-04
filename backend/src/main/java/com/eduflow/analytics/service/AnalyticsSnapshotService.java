package com.eduflow.analytics.service;

import com.eduflow.analytics.dto.AnalyticsSnapshotRequest;
import com.eduflow.analytics.dto.AnalyticsSnapshotResponse;
import java.util.List;
import java.util.UUID;

public interface AnalyticsSnapshotService {
    List<AnalyticsSnapshotResponse> findAll();

    AnalyticsSnapshotResponse findById(UUID id);

    AnalyticsSnapshotResponse create(AnalyticsSnapshotRequest request);
}
