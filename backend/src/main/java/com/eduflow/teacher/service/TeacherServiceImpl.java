package com.eduflow.teacher.service;

import com.eduflow.common.exception.ResourceNotFoundException;
import com.eduflow.teacher.domain.Teacher;
import com.eduflow.teacher.dto.TeacherRequest;
import com.eduflow.teacher.dto.TeacherResponse;
import com.eduflow.teacher.mapper.TeacherMapper;
import com.eduflow.teacher.repository.TeacherRepository;
import java.util.List;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class TeacherServiceImpl implements TeacherService {

    private static final Logger log = LoggerFactory.getLogger(TeacherServiceImpl.class);

    private final TeacherRepository repository;
    private final TeacherMapper mapper;

    public TeacherServiceImpl(TeacherRepository repository, TeacherMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<TeacherResponse> findAll() {
        log.debug("Loading Teacher records");
        return repository.findAll().stream()
                .map(mapper::toResponse)
                .toList();
    }

    @Override
    public TeacherResponse findById(UUID id) {
        Teacher teacher = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Teacher record not found: " + id));
        return mapper.toResponse(teacher);
    }

    @Override
    @Transactional
    public TeacherResponse create(TeacherRequest request) {
        log.info("Creating Teacher foundation record");
        Teacher saved = repository.save(mapper.toEntity(request));
        return mapper.toResponse(saved);
    }
}
