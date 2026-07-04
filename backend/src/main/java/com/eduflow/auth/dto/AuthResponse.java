package com.eduflow.auth.dto;

public record AuthResponse(
        String accessToken,
        String tokenType,
        long expiresInMinutes
) {
}
