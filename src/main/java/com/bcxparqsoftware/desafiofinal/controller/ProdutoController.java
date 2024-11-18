package com.bcxparqsoftware.desafiofinal.controller;

import com.bcxparqsoftware.desafiofinal.model.Produto;
import com.bcxparqsoftware.desafiofinal.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;

	@GetMapping
	public ResponseEntity<List<Produto>> findAll() {
		List<Produto> produtos = produtoService.findAll();
		return ResponseEntity.ok(produtos);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Produto> findById(@PathVariable Long id) {
		Optional<Produto> produto = produtoService.findById(id);
		return produto.map(ResponseEntity::ok)
			.orElseGet(() -> ResponseEntity.notFound().build());
	}

	@GetMapping("/findByName")
	public ResponseEntity<List<Produto>> findByName(@RequestParam String nome) {
		List<Produto> produtos = produtoService.findByNomeContainingIgnoreCase(nome);
		return ResponseEntity.ok(produtos);
	}

	@GetMapping("/count")
	public ResponseEntity<Long> count() {
		long totalProdutos = produtoService.count();
		return ResponseEntity.ok(totalProdutos);
	}

	@PostMapping
	public ResponseEntity<Produto> create(@RequestBody Produto produto) {
		Produto novoProduto = produtoService.save(produto);
		return ResponseEntity.status(201).body(novoProduto);
	}
}
