package com.eduflow.substitute.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record SubstituteRequest(
        @NotBlank @Size(max = 80) String code,
        @NotBlank @Size(max = 160) String name,
        @NotBlank @Size(max = 160) String assignmentScope
) {
}
