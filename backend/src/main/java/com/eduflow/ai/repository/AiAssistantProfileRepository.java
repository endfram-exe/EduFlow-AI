package com.eduflow.ai.repository;

import com.eduflow.ai.domain.AiAssistantProfile;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AiAssistantProfileRepository extends JpaRepository<AiAssistantProfile, UUID> {
}
