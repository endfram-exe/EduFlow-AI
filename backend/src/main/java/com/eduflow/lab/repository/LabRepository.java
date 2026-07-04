package com.eduflow.lab.repository;

import com.eduflow.lab.domain.Lab;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LabRepository extends JpaRepository<Lab, UUID> {
}
