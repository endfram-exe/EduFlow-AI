package com.eduflow.subject.service;

import com.eduflow.common.exception.ResourceNotFoundException;
import com.eduflow.subject.domain.Subject;
import com.eduflow.subject.dto.SubjectRequest;
import com.eduflow.subject.dto.SubjectResponse;
import com.eduflow.subject.mapper.SubjectMapper;
import com.eduflow.subject.repository.SubjectRepository;
import java.util.List;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class SubjectServiceImpl implements SubjectService {

    private static final Logger log = LoggerFactory.getLogger(SubjectServiceImpl.class);

    private final SubjectRepository repository;
    private final SubjectMapper mapper;

    public SubjectServiceImpl(SubjectRepository repository, SubjectMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<SubjectResponse> findAll() {
        log.debug("Loading Subject records");
        return repository.findAll().stream()
                .map(mapper::toResponse)
                .toList();
    }

    @Override
    public SubjectResponse findById(UUID id) {
        Subject subject = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Subject record not found: " + id));
        return mapper.toResponse(subject);
    }

    @Override
    @Transactional
    public SubjectResponse create(SubjectRequest request) {
        log.info("Creating Subject foundation record");
        Subject saved = repository.save(mapper.toEntity(request));
        return mapper.toResponse(saved);
    }
}
