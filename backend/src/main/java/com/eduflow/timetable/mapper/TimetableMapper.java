package com.eduflow.timetable.mapper;

import com.eduflow.timetable.domain.Timetable;
import com.eduflow.timetable.dto.TimetableRequest;
import com.eduflow.timetable.dto.TimetableResponse;
import org.springframework.stereotype.Component;

@Component
public class TimetableMapper {

    public Timetable toEntity(TimetableRequest request) {
        return Timetable.builder()
                .code(request.code())
                .name(request.name())
                .academicYear(request.academicYear())
                .build();
    }

    public TimetableResponse toResponse(Timetable timetable) {
        return new TimetableResponse(
                timetable.getId(),
                timetable.getCode(),
                timetable.getName(),
                timetable.getAcademicYear(),
                timetable.getCreatedAt(),
                timetable.getUpdatedAt()
        );
    }
}
