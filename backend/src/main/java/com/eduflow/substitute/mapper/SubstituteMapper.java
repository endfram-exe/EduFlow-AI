package com.eduflow.substitute.mapper;

import com.eduflow.substitute.domain.Substitute;
import com.eduflow.substitute.dto.SubstituteRequest;
import com.eduflow.substitute.dto.SubstituteResponse;
import org.springframework.stereotype.Component;

@Component
public class SubstituteMapper {

    public Substitute toEntity(SubstituteRequest request) {
        return Substitute.builder()
                .code(request.code())
                .name(request.name())
                .assignmentScope(request.assignmentScope())
                .build();
    }

    public SubstituteResponse toResponse(Substitute substitute) {
        return new SubstituteResponse(
                substitute.getId(),
                substitute.getCode(),
                substitute.getName(),
                substitute.getAssignmentScope(),
                substitute.getCreatedAt(),
                substitute.getUpdatedAt()
        );
    }
}
