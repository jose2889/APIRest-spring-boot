package com.practicas.API.Rest.models.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.practicas.API.Rest.models.entity.Cliente;

import com.practicas.API.Rest.models.repository.IClienteRepository;
import com.practicas.API.Rest.models.services.dto.ClienteDTO;

import com.practicas.API.Rest.models.services.mapper.ClienteMapper;

@Service
public class ClienteServiceImpl implements IClienteService {

	private final Logger log = LoggerFactory.getLogger(FacturaServiceImpl.class);
	
	@Autowired
	private IClienteRepository clienteRepository;
	
	@Autowired
	private ClienteMapper clienteMapper;
	
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
	public ClienteDTO save(ClienteDTO clienteDTO) {
	
		log.debug("Request to save Solicitud : {}", clienteDTO);

		Cliente cliente = clienteMapper.toEntity(clienteDTO);
		cliente = clienteRepository.save(cliente);

		return clienteMapper.toDto(cliente);
	}


	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		clienteRepository.deleteById(id);
	}

}
