package com.bcxparqsoftware.desafiofinal.service;

import com.bcxparqsoftware.desafiofinal.model.Cliente;
import com.bcxparqsoftware.desafiofinal.repository.ClienteRepository;
import com.bcxparqsoftware.desafiofinal.util.CpfUtil;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import java.util.List;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	public List<Cliente> findAll() {
		return clienteRepository.findAll();
	}

	public Cliente findById(Long id) {
		return clienteRepository.findById(id)
			.orElseThrow(() -> new EntityNotFoundException("Cliente não encontrado"));
	}

	public Cliente save(Cliente cliente, BindingResult result) {
		if (!CpfUtil.isCpfValido(cliente.getCpf())) {
			result.rejectValue("cpf", "cpf.invalido", "CPF inválido");
		}

		if (result.hasErrors()) {
			List<ObjectError> errors = result.getAllErrors();
			errors.forEach(error -> System.out.println("Erro: " + error.getDefaultMessage()));
			return null;
		}

		return clienteRepository.save(cliente);
	}

	public void deleteById(Long id) {
		clienteRepository.deleteById(id);
	}

	public List<Cliente> findByNome(String nome) {
		return clienteRepository.findByNomeContainingIgnoreCase(nome);
	}
}
