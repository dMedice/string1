package com.senai.Lana.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.Lana.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}