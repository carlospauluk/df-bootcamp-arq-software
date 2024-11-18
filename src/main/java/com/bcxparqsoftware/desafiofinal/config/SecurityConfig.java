package com.bcxparqsoftware.desafiofinal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http
			// Configura permissões para os endpoints
			.csrf(AbstractHttpConfigurer::disable) // Desabilita CSRF para APIs REST
			.authorizeHttpRequests(auth -> auth
				.requestMatchers("/api/**").permitAll()  // Permite acesso público às APIs
				.requestMatchers("/swagger-ui/**", "/v3/api-docs/**", "/swagger-ui.html", "/h2-console/**").permitAll() // Permitir acesso ao Swagger e H2 Console
				.anyRequest().authenticated()
			)
			.formLogin(AbstractHttpConfigurer::disable) // Desabilita o formulário de login
			.httpBasic(AbstractHttpConfigurer::disable) // Desabilita a autenticação básica
			.logout(AbstractHttpConfigurer::disable); // Desabilita logout automático

		return http.build();
	}
}
