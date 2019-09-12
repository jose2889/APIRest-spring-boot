package com.practicas.API.Rest.models.services;

import java.util.List;

import com.practicas.API.Rest.models.entity.Factura;
import com.practicas.API.Rest.models.services.dto.FacturaDTO;

public interface IFacturaService {

	public List<Factura> findAll();

	public Factura findById(Long id);

	public void delete(Long id);

	public FacturaDTO save(FacturaDTO facturaDTO);

}
