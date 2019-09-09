package com.practicas.API.Rest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.practicas.API.Rest.models.entity.Cliente;
import com.practicas.API.Rest.models.repository.IClienteRepository;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private IClienteRepository clienteRepository;
	
	
	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
	
		return clienteRepository.findAll();
	}


	@Override
	@Transactional(readOnly = true)
	public Cliente findById(Long id) {
		
		return clienteRepository.findById(id).orElse(null);
	}


	@Override
	@Transactional
	public Cliente save(Cliente cliente) {
		// TODO Auto-generated method stub
		return clienteRepository.save(cliente);
	}


	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		clienteRepository.deleteById(id);
	}

}
