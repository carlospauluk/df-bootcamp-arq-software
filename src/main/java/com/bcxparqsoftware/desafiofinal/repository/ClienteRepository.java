package com.bcxparqsoftware.desafiofinal.repository;

import com.bcxparqsoftware.desafiofinal.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	List<Cliente> findByNomeContainingIgnoreCase(String nome);

}
