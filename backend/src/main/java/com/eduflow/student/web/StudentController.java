package com.eduflow.student.web;

import com.eduflow.common.api.ApiResponse;
import com.eduflow.student.dto.StudentRequest;
import com.eduflow.student.dto.StudentResponse;
import com.eduflow.student.service.StudentService;
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
@RequestMapping("/api/v1/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping
    ResponseEntity<ApiResponse<List<StudentResponse>>> findAll() {
        return ResponseEntity.ok(ApiResponse.ok("Student records loaded", service.findAll()));
    }

    @GetMapping("/{id}")
    ResponseEntity<ApiResponse<StudentResponse>> findById(@PathVariable UUID id) {
        return ResponseEntity.ok(ApiResponse.ok("Student record loaded", service.findById(id)));
    }

    @PostMapping
    ResponseEntity<ApiResponse<StudentResponse>> create(@Valid @RequestBody StudentRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(ApiResponse.ok("Student record created", service.create(request)));
    }
}
