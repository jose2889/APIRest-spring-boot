package com.practicas.API.Rest.models.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.practicas.API.Rest.models.entity.Movimiento;
import com.practicas.API.Rest.models.repository.IMovimientoRepository;
import com.practicas.API.Rest.models.services.dto.MovimientoDTO;
import com.practicas.API.Rest.models.services.mapper.MovimientoMapper;

@Service
public class MovimientoServiceImpl implements IMovimientoService {

	private final Logger log = LoggerFactory.getLogger(MovimientoServiceImpl.class);

	@Autowired
	private IMovimientoRepository movimientoRepository;

	@Autowired
	private MovimientoMapper movimientoMapper;

	@Override
	@Transactional(readOnly = true)
	public List<Movimiento> findAll() {

		return movimientoRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Movimiento findById(Long id) {

		return movimientoRepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public MovimientoDTO save(MovimientoDTO movimientoDTO) {

		log.debug("Request to save Solicitud : {}", movimientoDTO);

		Movimiento movimiento = movimientoMapper.toEntity(movimientoDTO);
		movimiento = movimientoRepository.save(movimiento);

		return movimientoMapper.toDto(movimiento);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		movimientoRepository.deleteById(id);
	}

}
