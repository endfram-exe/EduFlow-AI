package com.eduflow.notification.service;

import com.eduflow.notification.dto.NotificationTemplateRequest;
import com.eduflow.notification.dto.NotificationTemplateResponse;
import java.util.List;
import java.util.UUID;

public interface NotificationTemplateService {
    List<NotificationTemplateResponse> findAll();

    NotificationTemplateResponse findById(UUID id);

    NotificationTemplateResponse create(NotificationTemplateRequest request);
}
