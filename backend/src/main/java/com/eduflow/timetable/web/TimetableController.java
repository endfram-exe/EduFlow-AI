package com.eduflow.timetable.web;

import com.eduflow.common.api.ApiResponse;
import com.eduflow.timetable.dto.TimetableRequest;
import com.eduflow.timetable.dto.TimetableResponse;
import com.eduflow.timetable.service.TimetableService;
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
@RequestMapping("/api/v1/timetables")
public class TimetableController {

    private final TimetableService service;

    public TimetableController(TimetableService service) {
        this.service = service;
    }

    @GetMapping
    ResponseEntity<ApiResponse<List<TimetableResponse>>> findAll() {
        return ResponseEntity.ok(ApiResponse.ok("Timetable records loaded", service.findAll()));
    }

    @GetMapping("/{id}")
    ResponseEntity<ApiResponse<TimetableResponse>> findById(@PathVariable UUID id) {
        return ResponseEntity.ok(ApiResponse.ok("Timetable record loaded", service.findById(id)));
    }

    @PostMapping
    ResponseEntity<ApiResponse<TimetableResponse>> create(@Valid @RequestBody TimetableRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(ApiResponse.ok("Timetable record created", service.create(request)));
    }
}
