package com.eduflow.analytics.repository;

import com.eduflow.analytics.domain.AnalyticsSnapshot;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnalyticsSnapshotRepository extends JpaRepository<AnalyticsSnapshot, UUID> {
}
