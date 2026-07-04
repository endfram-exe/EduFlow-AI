package com.eduflow.constraint.service;

import com.eduflow.constraint.dto.SchedulingConstraintRequest;
import com.eduflow.constraint.dto.SchedulingConstraintResponse;
import java.util.List;
import java.util.UUID;

public interface SchedulingConstraintService {
    List<SchedulingConstraintResponse> findAll();

    SchedulingConstraintResponse findById(UUID id);

    SchedulingConstraintResponse create(SchedulingConstraintRequest request);
}
