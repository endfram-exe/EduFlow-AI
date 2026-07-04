package com.eduflow.ai.service;

import com.eduflow.common.exception.ResourceNotFoundException;
import com.eduflow.ai.domain.AiAssistantProfile;
import com.eduflow.ai.dto.AiAssistantProfileRequest;
import com.eduflow.ai.dto.AiAssistantProfileResponse;
import com.eduflow.ai.mapper.AiAssistantProfileMapper;
import com.eduflow.ai.repository.AiAssistantProfileRepository;
import java.util.List;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class AiAssistantProfileServiceImpl implements AiAssistantProfileService {

    private static final Logger log = LoggerFactory.getLogger(AiAssistantProfileServiceImpl.class);

    private final AiAssistantProfileRepository repository;
    private final AiAssistantProfileMapper mapper;

    public AiAssistantProfileServiceImpl(AiAssistantProfileRepository repository, AiAssistantProfileMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<AiAssistantProfileResponse> findAll() {
        log.debug("Loading AI records");
        return repository.findAll().stream()
                .map(mapper::toResponse)
                .toList();
    }

    @Override
    public AiAssistantProfileResponse findById(UUID id) {
        AiAssistantProfile aiAssistantProfile = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("AI record not found: " + id));
        return mapper.toResponse(aiAssistantProfile);
    }

    @Override
    @Transactional
    public AiAssistantProfileResponse create(AiAssistantProfileRequest request) {
        log.info("Creating AI foundation record");
        AiAssistantProfile saved = repository.save(mapper.toEntity(request));
        return mapper.toResponse(saved);
    }
}
