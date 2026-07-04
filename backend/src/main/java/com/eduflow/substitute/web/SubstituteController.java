package com.eduflow.substitute.web;

import com.eduflow.common.api.ApiResponse;
import com.eduflow.substitute.dto.SubstituteRequest;
import com.eduflow.substitute.dto.SubstituteResponse;
import com.eduflow.substitute.service.SubstituteService;
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
@RequestMapping("/api/v1/substitutes")
public class SubstituteController {

    private final SubstituteService service;

    public SubstituteController(SubstituteService service) {
        this.service = service;
    }

    @GetMapping
    ResponseEntity<ApiResponse<List<SubstituteResponse>>> findAll() {
        return ResponseEntity.ok(ApiResponse.ok("Substitute records loaded", service.findAll()));
    }

    @GetMapping("/{id}")
    ResponseEntity<ApiResponse<SubstituteResponse>> findById(@PathVariable UUID id) {
        return ResponseEntity.ok(ApiResponse.ok("Substitute record loaded", service.findById(id)));
    }

    @PostMapping
    ResponseEntity<ApiResponse<SubstituteResponse>> create(@Valid @RequestBody SubstituteRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(ApiResponse.ok("Substitute record created", service.create(request)));
    }
}
