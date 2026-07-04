package com.eduflow.section.repository;

import com.eduflow.section.domain.Section;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SectionRepository extends JpaRepository<Section, UUID> {
}
