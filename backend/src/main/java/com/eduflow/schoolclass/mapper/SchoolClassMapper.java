package com.eduflow.schoolclass.mapper;

import com.eduflow.schoolclass.domain.SchoolClass;
import com.eduflow.schoolclass.dto.SchoolClassRequest;
import com.eduflow.schoolclass.dto.SchoolClassResponse;
import org.springframework.stereotype.Component;

@Component
public class SchoolClassMapper {

    public SchoolClass toEntity(SchoolClassRequest request) {
        return SchoolClass.builder()
                .code(request.code())
                .name(request.name())
                .gradeBand(request.gradeBand())
                .build();
    }

    public SchoolClassResponse toResponse(SchoolClass schoolClass) {
        return new SchoolClassResponse(
                schoolClass.getId(),
                schoolClass.getCode(),
                schoolClass.getName(),
                schoolClass.getGradeBand(),
                schoolClass.getCreatedAt(),
                schoolClass.getUpdatedAt()
        );
    }
}
