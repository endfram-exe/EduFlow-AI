package com.eduflow.constraint.service;

import com.eduflow.common.exception.ResourceNotFoundException;
import com.eduflow.constraint.domain.SchedulingConstraint;
import com.eduflow.constraint.dto.SchedulingConstraintRequest;
import com.eduflow.constraint.dto.SchedulingConstraintResponse;
import com.eduflow.constraint.mapper.SchedulingConstraintMapper;
import com.eduflow.constraint.repository.SchedulingConstraintRepository;
import java.util.List;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class SchedulingConstraintServiceImpl implements SchedulingConstraintService {

    private static final Logger log = LoggerFactory.getLogger(SchedulingConstraintServiceImpl.class);

    private final SchedulingConstraintRepository repository;
    private final SchedulingConstraintMapper mapper;

    public SchedulingConstraintServiceImpl(SchedulingConstraintRepository repository, SchedulingConstraintMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<SchedulingConstraintResponse> findAll() {
        log.debug("Loading Constraint records");
        return repository.findAll().stream()
                .map(mapper::toResponse)
                .toList();
    }

    @Override
    public SchedulingConstraintResponse findById(UUID id) {
        SchedulingConstraint schedulingConstraint = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Constraint record not found: " + id));
        return mapper.toResponse(schedulingConstraint);
    }

    @Override
    @Transactional
    public SchedulingConstraintResponse create(SchedulingConstraintRequest request) {
        log.info("Creating Constraint foundation record");
        SchedulingConstraint saved = repository.save(mapper.toEntity(request));
        return mapper.toResponse(saved);
    }
}
