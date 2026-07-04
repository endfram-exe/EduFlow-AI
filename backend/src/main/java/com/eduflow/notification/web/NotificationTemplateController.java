package com.eduflow.notification.web;

import com.eduflow.common.api.ApiResponse;
import com.eduflow.notification.dto.NotificationTemplateRequest;
import com.eduflow.notification.dto.NotificationTemplateResponse;
import com.eduflow.notification.service.NotificationTemplateService;
import jakarta.validation.Valid;
import java.util.List;
import java.util.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/notifications")
public class NotificationTemplateController {

    private final NotificationTemplateService service;

    public NotificationTemplateController(NotificationTemplateService service) {
        this.service = service;
    }

    @GetMapping
    ResponseEntity<ApiResponse<List<NotificationTemplateResponse>>> findAll() {
        return ResponseEntity.ok(ApiResponse.ok("Notification records loaded", service.findAll()));
    }

    @GetMapping("/{id}")
    ResponseEntity<ApiResponse<NotificationTemplateResponse>> findById(@PathVariable UUID id) {
        return ResponseEntity.ok(ApiResponse.ok("Notification record loaded", service.findById(id)));
    }

    @PostMapping
    ResponseEntity<ApiResponse<NotificationTemplateResponse>> create(@Valid @RequestBody NotificationTemplateRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(ApiResponse.ok("Notification record created", service.create(request)));
    }
}
