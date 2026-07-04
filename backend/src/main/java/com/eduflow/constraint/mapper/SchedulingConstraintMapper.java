package com.eduflow.constraint.mapper;

import com.eduflow.constraint.domain.SchedulingConstraint;
import com.eduflow.constraint.dto.SchedulingConstraintRequest;
import com.eduflow.constraint.dto.SchedulingConstraintResponse;
import org.springframework.stereotype.Component;

@Component
public class SchedulingConstraintMapper {

    public SchedulingConstraint toEntity(SchedulingConstraintRequest request) {
        return SchedulingConstraint.builder()
                .code(request.code())
                .name(request.name())
                .constraintType(request.constraintType())
                .build();
    }

    public SchedulingConstraintResponse toResponse(SchedulingConstraint schedulingConstraint) {
        return new SchedulingConstraintResponse(
                schedulingConstraint.getId(),
                schedulingConstraint.getCode(),
                schedulingConstraint.getName(),
                schedulingConstraint.getConstraintType(),
                schedulingConstraint.getCreatedAt(),
                schedulingConstraint.getUpdatedAt()
        );
    }
}
