package com.eduflow.constraint.repository;

import com.eduflow.constraint.domain.SchedulingConstraint;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchedulingConstraintRepository extends JpaRepository<SchedulingConstraint, UUID> {
}
