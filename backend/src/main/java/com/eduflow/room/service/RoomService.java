package com.eduflow.room.service;

import com.eduflow.room.dto.RoomRequest;
import com.eduflow.room.dto.RoomResponse;
import java.util.List;
import java.util.UUID;

public interface RoomService {
    List<RoomResponse> findAll();

    RoomResponse findById(UUID id);

    RoomResponse create(RoomRequest request);
}
