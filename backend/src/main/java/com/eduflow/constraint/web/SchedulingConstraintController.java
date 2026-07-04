package com.eduflow.constraint.web;

import com.eduflow.common.api.ApiResponse;
import com.eduflow.constraint.dto.SchedulingConstraintRequest;
import com.eduflow.constraint.dto.SchedulingConstraintResponse;
import com.eduflow.constraint.service.SchedulingConstraintService;
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
@RequestMapping("/api/v1/constraints")
public class SchedulingConstraintController {

    private final SchedulingConstraintService service;

    public SchedulingConstraintController(SchedulingConstraintService service) {
        this.service = service;
    }

    @GetMapping
    ResponseEntity<ApiResponse<List<SchedulingConstraintResponse>>> findAll() {
        return ResponseEntity.ok(ApiResponse.ok("Constraint records loaded", service.findAll()));
    }

    @GetMapping("/{id}")
    ResponseEntity<ApiResponse<SchedulingConstraintResponse>> findById(@PathVariable UUID id) {
        return ResponseEntity.ok(ApiResponse.ok("Constraint record loaded", service.findById(id)));
    }

    @PostMapping
    ResponseEntity<ApiResponse<SchedulingConstraintResponse>> create(@Valid @RequestBody SchedulingConstraintRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(ApiResponse.ok("Constraint record created", service.create(request)));
    }
}
