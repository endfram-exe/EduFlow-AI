package com.eduflow.room.mapper;

import com.eduflow.room.domain.Room;
import com.eduflow.room.dto.RoomRequest;
import com.eduflow.room.dto.RoomResponse;
import org.springframework.stereotype.Component;

@Component
public class RoomMapper {

    public Room toEntity(RoomRequest request) {
        return Room.builder()
                .code(request.code())
                .name(request.name())
                .building(request.building())
                .build();
    }

    public RoomResponse toResponse(Room room) {
        return new RoomResponse(
                room.getId(),
                room.getCode(),
                room.getName(),
                room.getBuilding(),
                room.getCreatedAt(),
                room.getUpdatedAt()
        );
    }
}
