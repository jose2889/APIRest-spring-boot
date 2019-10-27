package com.practicas.API.Rest.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.practicas.API.Rest.models.entity.Movimiento;
import com.practicas.API.Rest.models.services.FacturaServiceImpl;
import com.practicas.API.Rest.models.services.IMovimientoService;
import com.practicas.API.Rest.models.services.dto.MovimientoDTO;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class MovimientoRestController {

	private final Logger log = LoggerFactory.getLogger(FacturaServiceImpl.class);
	
	@Autowired
	private IMovimientoService movimientoService;
	
	@GetMapping("/movimientos")
	public List<Movimiento> index(){
		return movimientoService.findAll();
	}
	
	@GetMapping("/movimientos/{id}")
	public Movimiento show(@PathVariable Long id) {
		return movimientoService.findById(id);
	}
	
	@PostMapping("/movimientos")
	@ResponseStatus(HttpStatus.CREATED)
	public MovimientoDTO create(@RequestBody MovimientoDTO movimientoDTO) {
		
		log.debug("Controller CLIENTE DTO : {}", movimientoDTO);
	
		return movimientoService.save(movimientoDTO);
	}
	
	@PutMapping("/movimientos")
	@ResponseStatus(HttpStatus.CREATED)
	public MovimientoDTO update(@RequestBody MovimientoDTO movimientoDTO) {
		return movimientoService.save(movimientoDTO);
	}
	
	
	@DeleteMapping("/movimientos/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public void detele(@PathVariable Long id) {
		movimientoService.delete(id);
	}
}
