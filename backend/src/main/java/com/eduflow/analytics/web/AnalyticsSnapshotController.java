package com.eduflow.analytics.web;

import com.eduflow.common.api.ApiResponse;
import com.eduflow.analytics.dto.AnalyticsSnapshotRequest;
import com.eduflow.analytics.dto.AnalyticsSnapshotResponse;
import com.eduflow.analytics.service.AnalyticsSnapshotService;
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
@RequestMapping("/api/v1/analytics")
public class AnalyticsSnapshotController {

    private final AnalyticsSnapshotService service;

    public AnalyticsSnapshotController(AnalyticsSnapshotService service) {
        this.service = service;
    }

    @GetMapping
    ResponseEntity<ApiResponse<List<AnalyticsSnapshotResponse>>> findAll() {
        return ResponseEntity.ok(ApiResponse.ok("Analytics records loaded", service.findAll()));
    }

    @GetMapping("/{id}")
    ResponseEntity<ApiResponse<AnalyticsSnapshotResponse>> findById(@PathVariable UUID id) {
        return ResponseEntity.ok(ApiResponse.ok("Analytics record loaded", service.findById(id)));
    }

    @PostMapping
    ResponseEntity<ApiResponse<AnalyticsSnapshotResponse>> create(@Valid @RequestBody AnalyticsSnapshotRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(ApiResponse.ok("Analytics record created", service.create(request)));
    }
}
