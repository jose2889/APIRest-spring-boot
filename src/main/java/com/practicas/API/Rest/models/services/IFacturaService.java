package com.practicas.API.Rest.models.services;

import java.util.List;

import com.practicas.API.Rest.models.entity.Factura;

public interface IFacturaService {

	public List<Factura> findAll();

	public Factura findById(Long id);

	public Factura save(Factura factura);

	public void delete(Long id);

}
