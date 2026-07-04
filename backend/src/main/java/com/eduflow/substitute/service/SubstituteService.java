package com.eduflow.substitute.service;

import com.eduflow.substitute.dto.SubstituteRequest;
import com.eduflow.substitute.dto.SubstituteResponse;
import java.util.List;
import java.util.UUID;

public interface SubstituteService {
    List<SubstituteResponse> findAll();

    SubstituteResponse findById(UUID id);

    SubstituteResponse create(SubstituteRequest request);
}
