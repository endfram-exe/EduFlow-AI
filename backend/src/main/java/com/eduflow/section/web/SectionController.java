package com.eduflow.section.web;

import com.eduflow.common.api.ApiResponse;
import com.eduflow.section.dto.SectionRequest;
import com.eduflow.section.dto.SectionResponse;
import com.eduflow.section.service.SectionService;
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
@RequestMapping("/api/v1/sections")
public class SectionController {

    private final SectionService service;

    public SectionController(SectionService service) {
        this.service = service;
    }

    @GetMapping
    ResponseEntity<ApiResponse<List<SectionResponse>>> findAll() {
        return ResponseEntity.ok(ApiResponse.ok("Section records loaded", service.findAll()));
    }

    @GetMapping("/{id}")
    ResponseEntity<ApiResponse<SectionResponse>> findById(@PathVariable UUID id) {
        return ResponseEntity.ok(ApiResponse.ok("Section record loaded", service.findById(id)));
    }

    @PostMapping
    ResponseEntity<ApiResponse<SectionResponse>> create(@Valid @RequestBody SectionRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(ApiResponse.ok("Section record created", service.create(request)));
    }
}
