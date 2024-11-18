package com.bcxparqsoftware.desafiofinal.controller;

import com.bcxparqsoftware.desafiofinal.model.Cliente;
import com.bcxparqsoftware.desafiofinal.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

	@Autowired
	private ClienteRepository clienteRepository;

	@PostMapping
	public Cliente createCliente(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	@PutMapping("/{id}")
	public Cliente updateCliente(@PathVariable Long id, @RequestBody Cliente clienteAtualizado) {
		return clienteRepository.findById(id).map(cliente -> {
			cliente.setNome(clienteAtualizado.getNome());
			cliente.setEmail(clienteAtualizado.getEmail());
			cliente.setTelefone(clienteAtualizado.getTelefone());
			return clienteRepository.save(cliente);
		}).orElse(null);
	}

	@DeleteMapping("/{id}")
	public void deleteCliente(@PathVariable Long id) {
		clienteRepository.deleteById(id);
	}

	// Find All: Retornar todos os registros
	@GetMapping
	public ResponseEntity<List<Cliente>> findAll() {
		List<Cliente> clientes = clienteRepository.findAll();
		return ResponseEntity.ok(clientes);
	}

	// Find By ID: Retornar um registro específico com base no ID
	@GetMapping("/{id}")
	public ResponseEntity<Cliente> findById(@PathVariable Long id) {
		Optional<Cliente> cliente = clienteRepository.findById(id);
		return cliente.map(ResponseEntity::ok)
			.orElseGet(() -> ResponseEntity.notFound().build());
	}

	// Find By Name: Retornar registros que correspondam a um nome específico
	@GetMapping("/search")
	public ResponseEntity<List<Cliente>> findByName(@RequestParam String nome) {
		List<Cliente> clientes = clienteRepository.findByNomeContainingIgnoreCase(nome);
		return ResponseEntity.ok(clientes);
	}

	// Contagem: Retornar o número total de registros
	@GetMapping("/count")
	public ResponseEntity<Long> count() {
		long totalClientes = clienteRepository.count();
		return ResponseEntity.ok(totalClientes);
	}
}
