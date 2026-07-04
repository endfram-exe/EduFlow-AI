package com.eduflow.substitute.service;

import com.eduflow.common.exception.ResourceNotFoundException;
import com.eduflow.substitute.domain.Substitute;
import com.eduflow.substitute.dto.SubstituteRequest;
import com.eduflow.substitute.dto.SubstituteResponse;
import com.eduflow.substitute.mapper.SubstituteMapper;
import com.eduflow.substitute.repository.SubstituteRepository;
import java.util.List;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class SubstituteServiceImpl implements SubstituteService {

    private static final Logger log = LoggerFactory.getLogger(SubstituteServiceImpl.class);

    private final SubstituteRepository repository;
    private final SubstituteMapper mapper;

    public SubstituteServiceImpl(SubstituteRepository repository, SubstituteMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<SubstituteResponse> findAll() {
        log.debug("Loading Substitute records");
        return repository.findAll().stream()
                .map(mapper::toResponse)
                .toList();
    }

    @Override
    public SubstituteResponse findById(UUID id) {
        Substitute substitute = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Substitute record not found: " + id));
        return mapper.toResponse(substitute);
    }

    @Override
    @Transactional
    public SubstituteResponse create(SubstituteRequest request) {
        log.info("Creating Substitute foundation record");
        Substitute saved = repository.save(mapper.toEntity(request));
        return mapper.toResponse(saved);
    }
}
