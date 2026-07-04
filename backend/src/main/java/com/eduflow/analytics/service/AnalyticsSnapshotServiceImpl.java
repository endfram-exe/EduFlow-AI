package com.eduflow.analytics.service;

import com.eduflow.common.exception.ResourceNotFoundException;
import com.eduflow.analytics.domain.AnalyticsSnapshot;
import com.eduflow.analytics.dto.AnalyticsSnapshotRequest;
import com.eduflow.analytics.dto.AnalyticsSnapshotResponse;
import com.eduflow.analytics.mapper.AnalyticsSnapshotMapper;
import com.eduflow.analytics.repository.AnalyticsSnapshotRepository;
import java.util.List;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class AnalyticsSnapshotServiceImpl implements AnalyticsSnapshotService {

    private static final Logger log = LoggerFactory.getLogger(AnalyticsSnapshotServiceImpl.class);

    private final AnalyticsSnapshotRepository repository;
    private final AnalyticsSnapshotMapper mapper;

    public AnalyticsSnapshotServiceImpl(AnalyticsSnapshotRepository repository, AnalyticsSnapshotMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<AnalyticsSnapshotResponse> findAll() {
        log.debug("Loading Analytics records");
        return repository.findAll().stream()
                .map(mapper::toResponse)
                .toList();
    }

    @Override
    public AnalyticsSnapshotResponse findById(UUID id) {
        AnalyticsSnapshot analyticsSnapshot = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Analytics record not found: " + id));
        return mapper.toResponse(analyticsSnapshot);
    }

    @Override
    @Transactional
    public AnalyticsSnapshotResponse create(AnalyticsSnapshotRequest request) {
        log.info("Creating Analytics foundation record");
        AnalyticsSnapshot saved = repository.save(mapper.toEntity(request));
        return mapper.toResponse(saved);
    }
}
