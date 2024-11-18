package com.bcxparqsoftware.desafiofinal.controller;

import com.bcxparqsoftware.desafiofinal.model.Cliente;
import com.bcxparqsoftware.desafiofinal.model.PedidoDeVenda;
import com.bcxparqsoftware.desafiofinal.service.PedidoDeVendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoDeVendaController {

	@Autowired
	private PedidoDeVendaService pedidoDeVendaService;

	@PostMapping
	public PedidoDeVenda criarPedido(@RequestBody PedidoDeVenda pedido) {
		return pedidoDeVendaService.criarPedido(pedido);
	}

	@GetMapping
	public List<PedidoDeVenda> findAll() {
		return pedidoDeVendaService.findAll();
	}

	@GetMapping("/{id}")
	public PedidoDeVenda findById(@PathVariable Long id) {
		return pedidoDeVendaService.findById(id);
	}

	@GetMapping("/cliente/{clienteId}")
	public List<PedidoDeVenda> getPedidosByCliente(@PathVariable Long clienteId) {
		return pedidoDeVendaService.getPedidosByCliente(clienteId);
	}

	@GetMapping("/totalDeRegistros")
	public ResponseEntity<Long> totalDeRegistros() {
		long totalProdutos = pedidoDeVendaService.count();
		return ResponseEntity.ok(totalProdutos);
	}
}
