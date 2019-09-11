package com.practicas.API.Rest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.practicas.API.Rest.models.entity.Factura;

import com.practicas.API.Rest.models.repository.IFacturaRepository;

@Service
public class FacturaServiceImpl implements IFacturaService {

	@Autowired
	private IFacturaRepository facturaRepository;

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
	public Factura save(Factura factura) {
		// TODO Auto-generated method stub
		return facturaRepository.save(factura);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		facturaRepository.deleteById(id);
	}

}
