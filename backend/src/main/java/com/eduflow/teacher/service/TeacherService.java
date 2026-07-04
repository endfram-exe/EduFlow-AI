package com.eduflow.teacher.service;

import com.eduflow.teacher.dto.TeacherRequest;
import com.eduflow.teacher.dto.TeacherResponse;
import java.util.List;
import java.util.UUID;

public interface TeacherService {
    List<TeacherResponse> findAll();

    TeacherResponse findById(UUID id);

    TeacherResponse create(TeacherRequest request);
}
