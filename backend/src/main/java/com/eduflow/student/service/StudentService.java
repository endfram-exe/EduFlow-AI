package com.eduflow.student.service;

import com.eduflow.student.dto.StudentRequest;
import com.eduflow.student.dto.StudentResponse;
import java.util.List;
import java.util.UUID;

public interface StudentService {
    List<StudentResponse> findAll();

    StudentResponse findById(UUID id);

    StudentResponse create(StudentRequest request);
}
