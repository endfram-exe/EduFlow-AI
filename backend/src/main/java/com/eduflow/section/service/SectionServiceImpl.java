package com.eduflow.section.service;

import com.eduflow.common.exception.ResourceNotFoundException;
import com.eduflow.section.domain.Section;
import com.eduflow.section.dto.SectionRequest;
import com.eduflow.section.dto.SectionResponse;
import com.eduflow.section.mapper.SectionMapper;
import com.eduflow.section.repository.SectionRepository;
import java.util.List;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class SectionServiceImpl implements SectionService {

    private static final Logger log = LoggerFactory.getLogger(SectionServiceImpl.class);

    private final SectionRepository repository;
    private final SectionMapper mapper;

    public SectionServiceImpl(SectionRepository repository, SectionMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<SectionResponse> findAll() {
        log.debug("Loading Section records");
        return repository.findAll().stream()
                .map(mapper::toResponse)
                .toList();
    }

    @Override
    public SectionResponse findById(UUID id) {
        Section section = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Section record not found: " + id));
        return mapper.toResponse(section);
    }

    @Override
    @Transactional
    public SectionResponse create(SectionRequest request) {
        log.info("Creating Section foundation record");
        Section saved = repository.save(mapper.toEntity(request));
        return mapper.toResponse(saved);
    }
}
