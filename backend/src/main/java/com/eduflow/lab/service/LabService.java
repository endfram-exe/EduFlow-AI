package com.eduflow.lab.service;

import com.eduflow.lab.dto.LabRequest;
import com.eduflow.lab.dto.LabResponse;
import java.util.List;
import java.util.UUID;

public interface LabService {
    List<LabResponse> findAll();

    LabResponse findById(UUID id);

    LabResponse create(LabRequest request);
}
