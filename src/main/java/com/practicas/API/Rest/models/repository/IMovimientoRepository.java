package com.practicas.API.Rest.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practicas.API.Rest.models.entity.Movimiento;

public interface IMovimientoRepository extends JpaRepository<Movimiento, Long>{

}
