package com.practicas.API.Rest.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "movimientos")
public class Movimiento implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String lugar;
	private String fecha;
	private String descripcion;
	private Double monto;
	private Double montoTotal;
	private Integer numeroCuota;
	private Double totalPagoMes;

	private static final long serialVersionUID = 1L;
}
