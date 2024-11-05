package com.example.todolist;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
            .anyRequest().permitAll()  // Permet à toutes les requêtes d'accéder sans authentification
            .and()
            .csrf().disable();  // Désactive la protection CSRF pour simplifier les requêtes
        return http.build();
    }
}
