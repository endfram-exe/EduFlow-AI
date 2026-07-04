package com.eduflow.student.service;

import com.eduflow.common.exception.ResourceNotFoundException;
import com.eduflow.student.domain.Student;
import com.eduflow.student.dto.StudentRequest;
import com.eduflow.student.dto.StudentResponse;
import com.eduflow.student.mapper.StudentMapper;
import com.eduflow.student.repository.StudentRepository;
import java.util.List;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class StudentServiceImpl implements StudentService {

    private static final Logger log = LoggerFactory.getLogger(StudentServiceImpl.class);

    private final StudentRepository repository;
    private final StudentMapper mapper;

    public StudentServiceImpl(StudentRepository repository, StudentMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<StudentResponse> findAll() {
        log.debug("Loading Student records");
        return repository.findAll().stream()
                .map(mapper::toResponse)
                .toList();
    }

    @Override
    public StudentResponse findById(UUID id) {
        Student student = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student record not found: " + id));
        return mapper.toResponse(student);
    }

    @Override
    @Transactional
    public StudentResponse create(StudentRequest request) {
        log.info("Creating Student foundation record");
        Student saved = repository.save(mapper.toEntity(request));
        return mapper.toResponse(saved);
    }
}
