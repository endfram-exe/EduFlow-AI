package com.eduflow.substitute.repository;

import com.eduflow.substitute.domain.Substitute;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubstituteRepository extends JpaRepository<Substitute, UUID> {
}
