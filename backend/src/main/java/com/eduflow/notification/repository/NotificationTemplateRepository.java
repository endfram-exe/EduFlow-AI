package com.eduflow.notification.repository;

import com.eduflow.notification.domain.NotificationTemplate;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationTemplateRepository extends JpaRepository<NotificationTemplate, UUID> {
}
