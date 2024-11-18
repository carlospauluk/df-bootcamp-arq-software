package com.bcxparqsoftware.desafiofinal.config;

import com.bcxparqsoftware.desafiofinal.model.Cliente;
import com.bcxparqsoftware.desafiofinal.repository.ClienteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

	@Bean
	CommandLineRunner initDatabase(ClienteRepository clienteRepository) {
		return args -> {
			clienteRepository.save(new Cliente(null, "Carlos", "carlos@example.com", "42999555777"));
			clienteRepository.save(new Cliente(null, "Maria", "maria@example.com", "42999444555"));
			clienteRepository.save(new Cliente(null, "João", "joao@example.com", "41987654321"));
			System.out.println("Dados iniciais inseridos no banco de dados");
		};
	}
}
