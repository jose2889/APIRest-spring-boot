package com.practicas.API.Rest.ccontrollers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.practicas.API.Rest.models.entity.Cliente;
import com.practicas.API.Rest.models.services.FacturaServiceImpl;
import com.practicas.API.Rest.models.services.IClienteService;
import com.practicas.API.Rest.models.services.dto.ClienteDTO;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ClienteRestController {

	private final Logger log = LoggerFactory.getLogger(FacturaServiceImpl.class);
	
	@Autowired
	private IClienteService clienteService;
	
	@GetMapping("/clientes")
	public List<Cliente> index(){
		return clienteService.findAll();
	}
	
	@GetMapping("/clientes/{id}")
	public Cliente show(@PathVariable Long id) {
		return clienteService.findById(id);
	}
	
	@PostMapping("/clientes")
	@ResponseStatus(HttpStatus.CREATED)
	public ClienteDTO create(@RequestBody ClienteDTO clienteDTO) {
		
		log.debug("Controller CLIENTE DTO : {}", clienteDTO);
	
		return clienteService.save(clienteDTO);
	}
	
	@PutMapping("/clientes/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public ClienteDTO update(@RequestBody ClienteDTO clienteDTO, @PathVariable Long id) {
	
		
		return clienteService.save(clienteDTO);
	}
	
	
	@DeleteMapping("/clientes/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void detele(@PathVariable Long id) {
		clienteService.delete(id);
	}
}
