package com.bcxparqsoftware.desafiofinal.service;

import com.bcxparqsoftware.desafiofinal.model.Cliente;
import com.bcxparqsoftware.desafiofinal.model.PedidoDeVenda;
import com.bcxparqsoftware.desafiofinal.model.PedidoDeVendaItem;
import com.bcxparqsoftware.desafiofinal.model.Produto;
import com.bcxparqsoftware.desafiofinal.repository.PedidoDeVendaRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PedidoDeVendaService {

	@Autowired
	private PedidoDeVendaRepository pedidoDeVendaRepository;

	@Autowired
	private ProdutoService produtoService;

	@Transactional
	public PedidoDeVenda criarPedido(PedidoDeVenda pedido) {
		for (PedidoDeVendaItem item : pedido.getItens()) {
			Produto produto = produtoService.findById(item.getProduto().getId())
				.orElseThrow(() -> new EntityNotFoundException("Produto não encontrado"));

			if (produto.getEstoque() < item.getQtde()) {
				throw new IllegalArgumentException("Quantidade solicitada maior do que o estoque disponível para o produto: " + produto.getNome());
			}

			produtoService.atualizaEstoque(produto, item.getQtde());

			double subtotal = item.getQtde() * produto.getPreco();
			item.setSubtotal(subtotal);
			item.setPedidoDeVenda(pedido);
		}

		pedido.setDtVenda(LocalDateTime.now());
		return pedidoDeVendaRepository.save(pedido);
	}

	public PedidoDeVenda findById(Long id) {
		return pedidoDeVendaRepository.findById(id)
			.orElseThrow(() -> new EntityNotFoundException("Pedido de Venda não encontrado"));
	}

	public List<PedidoDeVenda> findAll() {
		return pedidoDeVendaRepository.findAll();
	}

	public List<PedidoDeVenda> getPedidosByCliente(Long clienteId) {
		return pedidoDeVendaRepository.findByClienteId(clienteId);
	}

	public long count() {
		return pedidoDeVendaRepository.count();
	}
}
