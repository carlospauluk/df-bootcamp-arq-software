package com.bcxparqsoftware.desafiofinal.controller;

import com.bcxparqsoftware.desafiofinal.model.Cliente;
import com.bcxparqsoftware.desafiofinal.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@GetMapping
	public List<Cliente> findAll() {
		return clienteService.findAll();
	}

	@GetMapping("/{id}")
	public Cliente findById(@PathVariable Long id) {
		return clienteService.findById(id);
	}

	@GetMapping("/buscarPeloNome")
	public List<Cliente> findByNome(@RequestParam String nome) {
		return clienteService.findByNome(nome);
	}

	@PostMapping
	public ResponseEntity<?> save(@RequestBody Cliente cliente, BindingResult result) {
		Cliente clienteSalvo = clienteService.save(cliente, result);

		if (clienteSalvo == null) {
			return ResponseEntity.badRequest().body("Erro na criação do cliente. Verifique os erros de validação.");
		}

		return ResponseEntity.ok(clienteSalvo);
	}

	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id) {
		clienteService.deleteById(id);
	}
}
