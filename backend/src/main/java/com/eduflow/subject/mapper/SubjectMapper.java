package com.eduflow.subject.mapper;

import com.eduflow.subject.domain.Subject;
import com.eduflow.subject.dto.SubjectRequest;
import com.eduflow.subject.dto.SubjectResponse;
import org.springframework.stereotype.Component;

@Component
public class SubjectMapper {

    public Subject toEntity(SubjectRequest request) {
        return Subject.builder()
                .code(request.code())
                .name(request.name())
                .department(request.department())
                .build();
    }

    public SubjectResponse toResponse(Subject subject) {
        return new SubjectResponse(
                subject.getId(),
                subject.getCode(),
                subject.getName(),
                subject.getDepartment(),
                subject.getCreatedAt(),
                subject.getUpdatedAt()
        );
    }
}
