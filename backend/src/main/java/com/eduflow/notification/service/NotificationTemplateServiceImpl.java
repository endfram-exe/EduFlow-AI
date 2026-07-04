package com.eduflow.notification.service;

import com.eduflow.common.exception.ResourceNotFoundException;
import com.eduflow.notification.domain.NotificationTemplate;
import com.eduflow.notification.dto.NotificationTemplateRequest;
import com.eduflow.notification.dto.NotificationTemplateResponse;
import com.eduflow.notification.mapper.NotificationTemplateMapper;
import com.eduflow.notification.repository.NotificationTemplateRepository;
import java.util.List;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class NotificationTemplateServiceImpl implements NotificationTemplateService {

    private static final Logger log = LoggerFactory.getLogger(NotificationTemplateServiceImpl.class);

    private final NotificationTemplateRepository repository;
    private final NotificationTemplateMapper mapper;

    public NotificationTemplateServiceImpl(NotificationTemplateRepository repository, NotificationTemplateMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<NotificationTemplateResponse> findAll() {
        log.debug("Loading Notification records");
        return repository.findAll().stream()
                .map(mapper::toResponse)
                .toList();
    }

    @Override
    public NotificationTemplateResponse findById(UUID id) {
        NotificationTemplate notificationTemplate = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Notification record not found: " + id));
        return mapper.toResponse(notificationTemplate);
    }

    @Override
    @Transactional
    public NotificationTemplateResponse create(NotificationTemplateRequest request) {
        log.info("Creating Notification foundation record");
        NotificationTemplate saved = repository.save(mapper.toEntity(request));
        return mapper.toResponse(saved);
    }
}
