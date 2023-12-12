package com.luv2code.springboot.cruddemo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

// Add config Annotation
@Configuration

public class DemoSecurityConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailsManager() {
        UserDetails nghia = User.builder()
                .username("nghia")
                .password("{noop}test123")
                .roles("EMPLOYEE")
                .build();

        UserDetails trongnghia = User.builder()
                .username("tnghia")
                .password("{noop}test123")
                .roles("EMPLOYEE", "MANAGER")
                .build();

        UserDetails lenghia = User.builder()
                .username("lnghia")
                .password("{noop}test123")
                .roles("EMPLOYEE", "MANAGER", "ADMIN")
                .build();

        return new InMemoryUserDetailsManager(nghia, trongnghia, lenghia);
    }
}
