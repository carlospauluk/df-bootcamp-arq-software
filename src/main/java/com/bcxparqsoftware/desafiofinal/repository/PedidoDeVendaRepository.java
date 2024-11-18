package com.bcxparqsoftware.desafiofinal.repository;

import com.bcxparqsoftware.desafiofinal.model.PedidoDeVenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PedidoDeVendaRepository extends JpaRepository<PedidoDeVenda, Long> {


	@Query("SELECT p FROM PedidoDeVenda p WHERE p.cliente.id = :clienteId")
	List<PedidoDeVenda> findByClienteId(@Param("clienteId") Long clienteId);

}
