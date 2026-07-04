package com.eduflow.section.mapper;

import com.eduflow.section.domain.Section;
import com.eduflow.section.dto.SectionRequest;
import com.eduflow.section.dto.SectionResponse;
import org.springframework.stereotype.Component;

@Component
public class SectionMapper {

    public Section toEntity(SectionRequest request) {
        return Section.builder()
                .code(request.code())
                .name(request.name())
                .capacity(request.capacity())
                .build();
    }

    public SectionResponse toResponse(Section section) {
        return new SectionResponse(
                section.getId(),
                section.getCode(),
                section.getName(),
                section.getCapacity(),
                section.getCreatedAt(),
                section.getUpdatedAt()
        );
    }
}
