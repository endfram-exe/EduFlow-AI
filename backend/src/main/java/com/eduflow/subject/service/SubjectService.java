package com.eduflow.subject.service;

import com.eduflow.subject.dto.SubjectRequest;
import com.eduflow.subject.dto.SubjectResponse;
import java.util.List;
import java.util.UUID;

public interface SubjectService {
    List<SubjectResponse> findAll();

    SubjectResponse findById(UUID id);

    SubjectResponse create(SubjectRequest request);
}
