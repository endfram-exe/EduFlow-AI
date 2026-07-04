package com.eduflow.timetable.service;

import com.eduflow.timetable.dto.TimetableRequest;
import com.eduflow.timetable.dto.TimetableResponse;
import java.util.List;
import java.util.UUID;

public interface TimetableService {
    List<TimetableResponse> findAll();

    TimetableResponse findById(UUID id);

    TimetableResponse create(TimetableRequest request);
}
