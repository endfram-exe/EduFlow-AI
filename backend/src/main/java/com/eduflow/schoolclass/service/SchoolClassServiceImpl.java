package com.eduflow.schoolclass.service;

import com.eduflow.common.exception.ResourceNotFoundException;
import com.eduflow.schoolclass.domain.SchoolClass;
import com.eduflow.schoolclass.dto.SchoolClassRequest;
import com.eduflow.schoolclass.dto.SchoolClassResponse;
import com.eduflow.schoolclass.mapper.SchoolClassMapper;
import com.eduflow.schoolclass.repository.SchoolClassRepository;
import java.util.List;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class SchoolClassServiceImpl implements SchoolClassService {

    private static final Logger log = LoggerFactory.getLogger(SchoolClassServiceImpl.class);

    private final SchoolClassRepository repository;
    private final SchoolClassMapper mapper;

    public SchoolClassServiceImpl(SchoolClassRepository repository, SchoolClassMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<SchoolClassResponse> findAll() {
        log.debug("Loading Class records");
        return repository.findAll().stream()
                .map(mapper::toResponse)
                .toList();
    }

    @Override
    public SchoolClassResponse findById(UUID id) {
        SchoolClass schoolClass = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Class record not found: " + id));
        return mapper.toResponse(schoolClass);
    }

    @Override
    @Transactional
    public SchoolClassResponse create(SchoolClassRequest request) {
        log.info("Creating Class foundation record");
        SchoolClass saved = repository.save(mapper.toEntity(request));
        return mapper.toResponse(saved);
    }
}
