package com.eduflow.auth;

import com.eduflow.auth.dto.AuthResponse;
import com.eduflow.auth.dto.LoginRequest;
import com.eduflow.security.JwtProperties;
import com.eduflow.security.JwtTokenService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    private static final Logger log = LoggerFactory.getLogger(AuthServiceImpl.class);

    private final JwtTokenService tokenService;
    private final JwtProperties jwtProperties;

    public AuthServiceImpl(JwtTokenService tokenService, JwtProperties jwtProperties) {
        this.tokenService = tokenService;
        this.jwtProperties = jwtProperties;
    }

    @Override
    public AuthResponse login(LoginRequest request) {
        log.info("Issuing foundation authentication token for {}", request.email());
        String token = tokenService.createToken(request.email(), List.of("ROLE_PLATFORM_ADMIN"));
        return new AuthResponse(token, "Bearer", jwtProperties.expirationMinutes());
    }
}
