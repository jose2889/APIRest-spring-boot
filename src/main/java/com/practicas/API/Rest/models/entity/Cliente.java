package com.practicas.API.Rest.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String apellido;
	private String email;

	// @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY, cascade =
	// CascadeType.ALL, orphanRemoval = true)
	// @JsonManagedReference
	// private List<Factura> facturas;
	// private Set<Factura> facturas = new HashSet<>();

	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date createAt;

	@PrePersist
	public void prePersis() {
		// TODO Auto-generated method stub
		createAt = new Date();
	}

	// public Cliente() {
	// facturas = new ArrayList<Factura>();
	// }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	// public List<Factura> getFacturas() {
	// return facturas;
	// }

	// public void setFacturas(List<Factura> facturas) {
	// this.facturas = facturas;
	// }

	// public void addFactura(Factura factura) {
	// facturas.add(factura);
	// }

	private static final long serialVersionUID = 1L;
}
