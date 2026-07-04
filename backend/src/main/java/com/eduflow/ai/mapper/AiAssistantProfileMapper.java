package com.eduflow.ai.mapper;

import com.eduflow.ai.domain.AiAssistantProfile;
import com.eduflow.ai.dto.AiAssistantProfileRequest;
import com.eduflow.ai.dto.AiAssistantProfileResponse;
import org.springframework.stereotype.Component;

@Component
public class AiAssistantProfileMapper {

    public AiAssistantProfile toEntity(AiAssistantProfileRequest request) {
        return AiAssistantProfile.builder()
                .code(request.code())
                .name(request.name())
                .modelProvider(request.modelProvider())
                .build();
    }

    public AiAssistantProfileResponse toResponse(AiAssistantProfile aiAssistantProfile) {
        return new AiAssistantProfileResponse(
                aiAssistantProfile.getId(),
                aiAssistantProfile.getCode(),
                aiAssistantProfile.getName(),
                aiAssistantProfile.getModelProvider(),
                aiAssistantProfile.getCreatedAt(),
                aiAssistantProfile.getUpdatedAt()
        );
    }
}
