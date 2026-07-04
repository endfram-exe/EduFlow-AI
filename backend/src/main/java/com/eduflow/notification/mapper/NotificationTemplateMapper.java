package com.eduflow.notification.mapper;

import com.eduflow.notification.domain.NotificationTemplate;
import com.eduflow.notification.dto.NotificationTemplateRequest;
import com.eduflow.notification.dto.NotificationTemplateResponse;
import org.springframework.stereotype.Component;

@Component
public class NotificationTemplateMapper {

    public NotificationTemplate toEntity(NotificationTemplateRequest request) {
        return NotificationTemplate.builder()
                .code(request.code())
                .name(request.name())
                .channel(request.channel())
                .build();
    }

    public NotificationTemplateResponse toResponse(NotificationTemplate notificationTemplate) {
        return new NotificationTemplateResponse(
                notificationTemplate.getId(),
                notificationTemplate.getCode(),
                notificationTemplate.getName(),
                notificationTemplate.getChannel(),
                notificationTemplate.getCreatedAt(),
                notificationTemplate.getUpdatedAt()
        );
    }
}
