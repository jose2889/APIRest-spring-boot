package com.practicas.API.Rest.models.services.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class FacturaDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String descripcion;
	private String observacion;
	private Date createAt;
	private Long clienteId;

}
