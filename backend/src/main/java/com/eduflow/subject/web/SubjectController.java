package com.eduflow.subject.web;

import com.eduflow.common.api.ApiResponse;
import com.eduflow.subject.dto.SubjectRequest;
import com.eduflow.subject.dto.SubjectResponse;
import com.eduflow.subject.service.SubjectService;
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
@RequestMapping("/api/v1/subjects")
public class SubjectController {

    private final SubjectService service;

    public SubjectController(SubjectService service) {
        this.service = service;
    }

    @GetMapping
    ResponseEntity<ApiResponse<List<SubjectResponse>>> findAll() {
        return ResponseEntity.ok(ApiResponse.ok("Subject records loaded", service.findAll()));
    }

    @GetMapping("/{id}")
    ResponseEntity<ApiResponse<SubjectResponse>> findById(@PathVariable UUID id) {
        return ResponseEntity.ok(ApiResponse.ok("Subject record loaded", service.findById(id)));
    }

    @PostMapping
    ResponseEntity<ApiResponse<SubjectResponse>> create(@Valid @RequestBody SubjectRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(ApiResponse.ok("Subject record created", service.create(request)));
    }
}
