package com.eduflow.room.repository;

import com.eduflow.room.domain.Room;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, UUID> {
}
