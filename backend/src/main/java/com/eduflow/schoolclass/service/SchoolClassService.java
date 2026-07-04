package com.eduflow.schoolclass.service;

import com.eduflow.schoolclass.dto.SchoolClassRequest;
import com.eduflow.schoolclass.dto.SchoolClassResponse;
import java.util.List;
import java.util.UUID;

public interface SchoolClassService {
    List<SchoolClassResponse> findAll();

    SchoolClassResponse findById(UUID id);

    SchoolClassResponse create(SchoolClassRequest request);
}
