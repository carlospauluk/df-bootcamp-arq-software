package com.bcxparqsoftware.desafiofinal.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	private String nome;

	@NotNull
	private String email;

	@NotNull
	private String telefone;

	@NotNull
	private String cpf;

	@Embedded
	private EnderecoDeEntrega enderecoDeEntrega;
}
