package com.practicas.API.Rest.models.services.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class MovimientoDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String lugar;
	private String fecha;
	private String descripcion;
	private Double monto;
	private Double montoTotal;
	private Integer numeroCuota;
	private Double totalPagoMes;

}
