package com.eduflow.room.service;

import com.eduflow.common.exception.ResourceNotFoundException;
import com.eduflow.room.domain.Room;
import com.eduflow.room.dto.RoomRequest;
import com.eduflow.room.dto.RoomResponse;
import com.eduflow.room.mapper.RoomMapper;
import com.eduflow.room.repository.RoomRepository;
import java.util.List;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class RoomServiceImpl implements RoomService {

    private static final Logger log = LoggerFactory.getLogger(RoomServiceImpl.class);

    private final RoomRepository repository;
    private final RoomMapper mapper;

    public RoomServiceImpl(RoomRepository repository, RoomMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<RoomResponse> findAll() {
        log.debug("Loading Room records");
        return repository.findAll().stream()
                .map(mapper::toResponse)
                .toList();
    }

    @Override
    public RoomResponse findById(UUID id) {
        Room room = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Room record not found: " + id));
        return mapper.toResponse(room);
    }

    @Override
    @Transactional
    public RoomResponse create(RoomRequest request) {
        log.info("Creating Room foundation record");
        Room saved = repository.save(mapper.toEntity(request));
        return mapper.toResponse(saved);
    }
}
