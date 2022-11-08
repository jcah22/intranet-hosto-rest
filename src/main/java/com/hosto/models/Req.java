package com.hosto.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Req implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_req;

	private String codigo;

	private String nombre;

	@ManyToOne
	@JoinColumn(name = "empresa_id")
	private Empresa empresa;

	public Req() {

	}

	public Req(Long id_req, String codigo, String nombre, Empresa empresa) {
		super();
		this.id_req = id_req;
		this.codigo = codigo;
		this.nombre = nombre;
		this.empresa = empresa;

	}

	public Long getId_req() {
		return id_req;
	}

	public void setId_req(Long id_req) {
		this.id_req = id_req;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	@Override
	public String toString() {
		return "Req [id_req=" + id_req + ", codigo=" + codigo + ", nombre=" + nombre + ", empresa=" + empresa
				+ ", odcs=" + "]";
	}

}
