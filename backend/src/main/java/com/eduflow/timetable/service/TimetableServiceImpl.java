package com.eduflow.timetable.service;

import com.eduflow.common.exception.ResourceNotFoundException;
import com.eduflow.timetable.domain.Timetable;
import com.eduflow.timetable.dto.TimetableRequest;
import com.eduflow.timetable.dto.TimetableResponse;
import com.eduflow.timetable.mapper.TimetableMapper;
import com.eduflow.timetable.repository.TimetableRepository;
import java.util.List;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class TimetableServiceImpl implements TimetableService {

    private static final Logger log = LoggerFactory.getLogger(TimetableServiceImpl.class);

    private final TimetableRepository repository;
    private final TimetableMapper mapper;

    public TimetableServiceImpl(TimetableRepository repository, TimetableMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<TimetableResponse> findAll() {
        log.debug("Loading Timetable records");
        return repository.findAll().stream()
                .map(mapper::toResponse)
                .toList();
    }

    @Override
    public TimetableResponse findById(UUID id) {
        Timetable timetable = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Timetable record not found: " + id));
        return mapper.toResponse(timetable);
    }

    @Override
    @Transactional
    public TimetableResponse create(TimetableRequest request) {
        log.info("Creating Timetable foundation record");
        Timetable saved = repository.save(mapper.toEntity(request));
        return mapper.toResponse(saved);
    }
}
