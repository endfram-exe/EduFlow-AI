package com.eduflow.lab.service;

import com.eduflow.common.exception.ResourceNotFoundException;
import com.eduflow.lab.domain.Lab;
import com.eduflow.lab.dto.LabRequest;
import com.eduflow.lab.dto.LabResponse;
import com.eduflow.lab.mapper.LabMapper;
import com.eduflow.lab.repository.LabRepository;
import java.util.List;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class LabServiceImpl implements LabService {

    private static final Logger log = LoggerFactory.getLogger(LabServiceImpl.class);

    private final LabRepository repository;
    private final LabMapper mapper;

    public LabServiceImpl(LabRepository repository, LabMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<LabResponse> findAll() {
        log.debug("Loading Lab records");
        return repository.findAll().stream()
                .map(mapper::toResponse)
                .toList();
    }

    @Override
    public LabResponse findById(UUID id) {
        Lab lab = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Lab record not found: " + id));
        return mapper.toResponse(lab);
    }

    @Override
    @Transactional
    public LabResponse create(LabRequest request) {
        log.info("Creating Lab foundation record");
        Lab saved = repository.save(mapper.toEntity(request));
        return mapper.toResponse(saved);
    }
}
