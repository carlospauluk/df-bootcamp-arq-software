package com.bcxparqsoftware.desafiofinal.model;


import jakarta.persistence.Embeddable;
import lombok.Data;


@Data
@Embeddable
public class EnderecoDeEntrega {
	private String logradouro;
	private String numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
}

