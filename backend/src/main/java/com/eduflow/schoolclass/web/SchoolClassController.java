package com.eduflow.schoolclass.web;

import com.eduflow.common.api.ApiResponse;
import com.eduflow.schoolclass.dto.SchoolClassRequest;
import com.eduflow.schoolclass.dto.SchoolClassResponse;
import com.eduflow.schoolclass.service.SchoolClassService;
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
@RequestMapping("/api/v1/classes")
public class SchoolClassController {

    private final SchoolClassService service;

    public SchoolClassController(SchoolClassService service) {
        this.service = service;
    }

    @GetMapping
    ResponseEntity<ApiResponse<List<SchoolClassResponse>>> findAll() {
        return ResponseEntity.ok(ApiResponse.ok("Class records loaded", service.findAll()));
    }

    @GetMapping("/{id}")
    ResponseEntity<ApiResponse<SchoolClassResponse>> findById(@PathVariable UUID id) {
        return ResponseEntity.ok(ApiResponse.ok("Class record loaded", service.findById(id)));
    }

    @PostMapping
    ResponseEntity<ApiResponse<SchoolClassResponse>> create(@Valid @RequestBody SchoolClassRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(ApiResponse.ok("Class record created", service.create(request)));
    }
}
