package com.eduflow.ai.service;

import com.eduflow.ai.dto.AiAssistantProfileRequest;
import com.eduflow.ai.dto.AiAssistantProfileResponse;
import java.util.List;
import java.util.UUID;

public interface AiAssistantProfileService {
    List<AiAssistantProfileResponse> findAll();

    AiAssistantProfileResponse findById(UUID id);

    AiAssistantProfileResponse create(AiAssistantProfileRequest request);
}
