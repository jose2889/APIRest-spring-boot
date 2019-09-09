package com.practicas.API.Rest.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practicas.API.Rest.models.entity.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, Long>{

}
