package com.eduflow.timetable.repository;

import com.eduflow.timetable.domain.Timetable;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimetableRepository extends JpaRepository<Timetable, UUID> {
}
