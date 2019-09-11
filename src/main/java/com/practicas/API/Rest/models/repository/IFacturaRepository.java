package com.practicas.API.Rest.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practicas.API.Rest.models.entity.Factura;

public interface IFacturaRepository extends JpaRepository<Factura, Long> {

}
