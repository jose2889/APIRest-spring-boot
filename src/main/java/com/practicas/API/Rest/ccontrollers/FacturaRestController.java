package com.practicas.API.Rest.ccontrollers;

import java.util.List;

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

//@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class FacturaRestController {

	@Autowired
	private IFacturaService facturaService;
	
	@GetMapping("/facturas")
	public List<Factura> index(){
		return facturaService.findAll();
	}
	
	@GetMapping("/facturas/{id}")
	public Factura show(@PathVariable Long id) {
		return facturaService.findById(id);
	}
	
	@PostMapping("/facturas")
	@ResponseStatus(HttpStatus.CREATED)
	public Factura create(@RequestBody Factura factura) {
		
		return facturaService.save(factura);
	}
	
	@PutMapping("/facturas/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Factura update(@RequestBody Factura factura, @PathVariable Long id) {
		Factura facturaActual = facturaService.findById(id);
		
		facturaActual.setDescripcion(factura.getDescripcion());
		facturaActual.setObservacion(factura.getObservacion());
		facturaActual.setCliente(factura.getCliente());
		
		return facturaService.save(facturaActual);
	}
	
	@DeleteMapping("/facturas/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void detele(@PathVariable Long id) {
		facturaService.delete(id);
	}
}
