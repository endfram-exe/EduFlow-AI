package com.eduflow.schoolclass.repository;

import com.eduflow.schoolclass.domain.SchoolClass;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolClassRepository extends JpaRepository<SchoolClass, UUID> {
}
