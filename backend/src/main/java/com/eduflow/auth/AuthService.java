package com.eduflow.auth;

import com.eduflow.auth.dto.AuthResponse;
import com.eduflow.auth.dto.LoginRequest;

public interface AuthService {
    AuthResponse login(LoginRequest request);
}
