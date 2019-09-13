package com.practicas.API.Rest.ccontrollers;

import java.net.URISyntaxException;
import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.practicas.API.Rest.models.entity.Factura;
import com.practicas.API.Rest.models.services.IFacturaService;
import com.practicas.API.Rest.models.services.dto.FacturaDTO;

import javax.validation.Valid;


//@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class FacturaRestController {

	private final Logger log = LoggerFactory.getLogger(FacturaRestController.class);

	@Autowired
	private IFacturaService facturaService;

	@GetMapping("/facturas")
	public List<Factura> index() {
		return facturaService.findAll();
	}

	@GetMapping("/facturas/{id}")
	public Factura show(@PathVariable Long id) {
		return facturaService.findById(id);
	}

	@PostMapping("/facturas")
	@ResponseStatus(HttpStatus.CREATED)
	public FacturaDTO create(@Valid @RequestBody FacturaDTO facturaDTO) throws URISyntaxException {
		log.debug("Controller Factura DTO : {}", facturaDTO);
		return facturaService.save(facturaDTO);
	}

	@PutMapping("/facturas/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public FacturaDTO update(@RequestBody FacturaDTO facturaDTO, @PathVariable Long id) {

		return facturaService.save(facturaDTO);
	}

	@DeleteMapping("/facturas/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void detele(@PathVariable Long id) {
		facturaService.delete(id);
	}
}
