package com.eduflow.ai.web;

import com.eduflow.common.api.ApiResponse;
import com.eduflow.ai.dto.AiAssistantProfileRequest;
import com.eduflow.ai.dto.AiAssistantProfileResponse;
import com.eduflow.ai.service.AiAssistantProfileService;
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
@RequestMapping("/api/v1/ai")
public class AiAssistantProfileController {

    private final AiAssistantProfileService service;

    public AiAssistantProfileController(AiAssistantProfileService service) {
        this.service = service;
    }

    @GetMapping
    ResponseEntity<ApiResponse<List<AiAssistantProfileResponse>>> findAll() {
        return ResponseEntity.ok(ApiResponse.ok("AI records loaded", service.findAll()));
    }

    @GetMapping("/{id}")
    ResponseEntity<ApiResponse<AiAssistantProfileResponse>> findById(@PathVariable UUID id) {
        return ResponseEntity.ok(ApiResponse.ok("AI record loaded", service.findById(id)));
    }

    @PostMapping
    ResponseEntity<ApiResponse<AiAssistantProfileResponse>> create(@Valid @RequestBody AiAssistantProfileRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(ApiResponse.ok("AI record created", service.create(request)));
    }
}
