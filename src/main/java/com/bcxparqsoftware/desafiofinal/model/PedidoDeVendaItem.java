package com.bcxparqsoftware.desafiofinal.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
public class PedidoDeVendaItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "pedido_de_venda_id", nullable = false)
	@JsonBackReference
	@ToString.Exclude
	private PedidoDeVenda pedidoDeVenda;

	@ManyToOne
	@JoinColumn(name = "produto_id", nullable = false)
	private Produto produto;

	@NotNull
	private Integer qtde;

	private Double desconto;

	@NotNull
	private Double subtotal;

	public Double getTotal() {
		return (produto.getPreco() * qtde) - (desconto != null ? desconto : 0.0);
	}
}
