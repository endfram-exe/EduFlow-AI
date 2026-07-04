package com.eduflow.teacher.web;

import com.eduflow.common.api.ApiResponse;
import com.eduflow.teacher.dto.TeacherRequest;
import com.eduflow.teacher.dto.TeacherResponse;
import com.eduflow.teacher.service.TeacherService;
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
@RequestMapping("/api/v1/teachers")
public class TeacherController {

    private final TeacherService service;

    public TeacherController(TeacherService service) {
        this.service = service;
    }

    @GetMapping
    ResponseEntity<ApiResponse<List<TeacherResponse>>> findAll() {
        return ResponseEntity.ok(ApiResponse.ok("Teacher records loaded", service.findAll()));
    }

    @GetMapping("/{id}")
    ResponseEntity<ApiResponse<TeacherResponse>> findById(@PathVariable UUID id) {
        return ResponseEntity.ok(ApiResponse.ok("Teacher record loaded", service.findById(id)));
    }

    @PostMapping
    ResponseEntity<ApiResponse<TeacherResponse>> create(@Valid @RequestBody TeacherRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(ApiResponse.ok("Teacher record created", service.create(request)));
    }
}
