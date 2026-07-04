package com.eduflow.section.service;

import com.eduflow.section.dto.SectionRequest;
import com.eduflow.section.dto.SectionResponse;
import java.util.List;
import java.util.UUID;

public interface SectionService {
    List<SectionResponse> findAll();

    SectionResponse findById(UUID id);

    SectionResponse create(SectionRequest request);
}
