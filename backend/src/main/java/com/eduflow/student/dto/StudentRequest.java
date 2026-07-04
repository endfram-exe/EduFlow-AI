package com.eduflow.student.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record StudentRequest(
        @NotBlank @Size(max = 80) String admissionNumber,
        @NotBlank @Size(max = 160) String displayName,
        @NotBlank @Size(max = 160) String email
) {
}
