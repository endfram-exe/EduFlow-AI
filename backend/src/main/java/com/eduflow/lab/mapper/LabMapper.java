package com.eduflow.lab.mapper;

import com.eduflow.lab.domain.Lab;
import com.eduflow.lab.dto.LabRequest;
import com.eduflow.lab.dto.LabResponse;
import org.springframework.stereotype.Component;

@Component
public class LabMapper {

    public Lab toEntity(LabRequest request) {
        return Lab.builder()
                .code(request.code())
                .name(request.name())
                .specialization(request.specialization())
                .build();
    }

    public LabResponse toResponse(Lab lab) {
        return new LabResponse(
                lab.getId(),
                lab.getCode(),
                lab.getName(),
                lab.getSpecialization(),
                lab.getCreatedAt(),
                lab.getUpdatedAt()
        );
    }
}
