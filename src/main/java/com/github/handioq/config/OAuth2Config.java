package com.github.handioq.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class OAuth2Config {

    @Bean
    public PasswordEncoder clientPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
