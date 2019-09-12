package com.practicas.API.Rest.models.services;

import java.util.List;

import com.practicas.API.Rest.models.entity.Cliente;
import com.practicas.API.Rest.models.services.dto.ClienteDTO;

public interface IClienteService {
	
	public List<Cliente> findAll();
	
	public Cliente findById(Long id);
	
	public ClienteDTO save(ClienteDTO clienteDTO);
	
	public void delete(Long id);

}
