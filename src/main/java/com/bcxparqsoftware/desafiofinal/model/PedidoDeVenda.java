package com.bcxparqsoftware.desafiofinal.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class PedidoDeVenda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "cliente_id", nullable = false)
	private Cliente cliente;

	@Embedded
	private EnderecoDeEntrega enderecoDeEntrega;

	@NotNull
	private LocalDateTime dtVenda;

	@Enumerated(EnumType.STRING)
	@NotNull
	private ModoPagamento modoPagamento;

	@OneToMany(mappedBy = "pedidoDeVenda", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonManagedReference
	@ToString.Exclude
	private List<PedidoDeVendaItem> itens;


	public Double getTotal() {
		return itens.stream()
			.mapToDouble(PedidoDeVendaItem::getTotal)
			.sum();
	}

}
