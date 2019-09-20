package com.practicas.API.Rest.models.services.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class ClienteDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String nombre;
	private String apellido;
	private String email;
	private Date createAt;

}
