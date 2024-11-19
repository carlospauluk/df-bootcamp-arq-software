package com.bcxparqsoftware.desafiofinal.service;

import com.bcxparqsoftware.desafiofinal.model.Produto;
import com.bcxparqsoftware.desafiofinal.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;

	public Optional<Produto> findById(Long id) {
		return produtoRepository.findById(id);
	}

	public List<Produto> findByNomeContainingIgnoreCase(String nome) {
		return produtoRepository.findByNomeContainingIgnoreCase(nome);
	}

	public List<Produto> findAll() {
		return produtoRepository.findAll();
	}

	public long count() {
		return produtoRepository.count();
	}

	public Produto save(Produto produto) {
		return produtoRepository.save(produto);
	}

	public void verificarEstoque(Produto produto, int quantidadeSolicitada) {
		if (produto.getEstoque() < quantidadeSolicitada) {
			throw new IllegalArgumentException("Quantidade solicitada maior do que o estoque disponível para o produto: " + produto.getNome());
		}
	}

	public void atualizaEstoque(Produto produto, int quantidadeSolicitada) {
		verificarEstoque(produto, quantidadeSolicitada);
		produto.setEstoque(produto.getEstoque() - quantidadeSolicitada);
		produtoRepository.save(produto);
	}

	public void deleteById(Long id) {
		produtoRepository.deleteById(id);
	}
}
