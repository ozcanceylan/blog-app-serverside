package com.springboot.blog.service;

import com.springboot.blog.payload.dto.LoginDto;
import com.springboot.blog.payload.dto.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);

    String register(RegisterDto registerDto);
}
