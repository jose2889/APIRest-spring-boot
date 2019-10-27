package com.practicas.API.Rest.models.services;

import java.util.List;

import com.practicas.API.Rest.models.entity.Movimiento;
import com.practicas.API.Rest.models.services.dto.MovimientoDTO;

public interface IMovimientoService {

	public List<Movimiento> findAll();

	public Movimiento findById(Long id);

	public MovimientoDTO save(MovimientoDTO movimientoDTO);

	public void delete(Long id);

}
