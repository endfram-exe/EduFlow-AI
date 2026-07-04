package com.eduflow.security;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "eduflow.security.jwt")
public record JwtProperties(
        String issuer,
        long expirationMinutes,
        String secret
) {
}
