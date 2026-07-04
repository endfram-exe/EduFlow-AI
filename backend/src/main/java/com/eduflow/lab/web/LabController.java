package com.eduflow.lab.web;

import com.eduflow.common.api.ApiResponse;
import com.eduflow.lab.dto.LabRequest;
import com.eduflow.lab.dto.LabResponse;
import com.eduflow.lab.service.LabService;
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
@RequestMapping("/api/v1/labs")
public class LabController {

    private final LabService service;

    public LabController(LabService service) {
        this.service = service;
    }

    @GetMapping
    ResponseEntity<ApiResponse<List<LabResponse>>> findAll() {
        return ResponseEntity.ok(ApiResponse.ok("Lab records loaded", service.findAll()));
    }

    @GetMapping("/{id}")
    ResponseEntity<ApiResponse<LabResponse>> findById(@PathVariable UUID id) {
        return ResponseEntity.ok(ApiResponse.ok("Lab record loaded", service.findById(id)));
    }

    @PostMapping
    ResponseEntity<ApiResponse<LabResponse>> create(@Valid @RequestBody LabRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(ApiResponse.ok("Lab record created", service.create(request)));
    }
}
