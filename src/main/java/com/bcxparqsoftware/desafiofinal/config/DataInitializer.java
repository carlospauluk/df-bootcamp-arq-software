package com.bcxparqsoftware.desafiofinal.config;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.nio.file.Files;
import java.nio.file.Path;

@Component
public class DataInitializer {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@PostConstruct
	public void init() {
		try {
			Path path = new ClassPathResource("initial-data.sql").getFile().toPath();
			String sql = Files.readString(path);

			jdbcTemplate.execute(sql);
			System.out.println("Dados inicializados com sucesso a partir do data.sql!");

		} catch (Exception e) {
			System.err.println("Erro ao inicializar dados: " + e.getMessage());
		}
	}
}
