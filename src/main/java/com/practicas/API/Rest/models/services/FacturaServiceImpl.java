package com.practicas.API.Rest.models.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.practicas.API.Rest.models.entity.Factura;

import com.practicas.API.Rest.models.repository.IFacturaRepository;
import com.practicas.API.Rest.models.services.dto.FacturaDTO;
import com.practicas.API.Rest.models.services.mapper.FacturaMapper;

@Service
public class FacturaServiceImpl implements IFacturaService {

	private final Logger log = LoggerFactory.getLogger(FacturaServiceImpl.class);

	@Autowired
	private IFacturaRepository facturaRepository;

	private FacturaMapper facturaMapper;

	@Override
	@Transactional(readOnly = true)
	public List<Factura> findAll() {

		return facturaRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Factura findById(Long id) {

		return facturaRepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public FacturaDTO save(FacturaDTO facturaDTO) {

		log.debug("Request to save Solicitud : {}", facturaDTO);

		Factura factura = facturaMapper.toEntity(facturaDTO);
		factura = facturaRepository.save(factura);

		return facturaMapper.toDto(factura);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		facturaRepository.deleteById(id);
	}

}
