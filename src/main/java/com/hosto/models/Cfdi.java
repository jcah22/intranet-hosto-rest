package com.hosto.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cfdi implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id_cfdi;

	private String codigo;

	private String nombre;

	public Cfdi() {

	}

	public Cfdi(Long id_cfdi, String codigo, String nombre) {

		this.id_cfdi = id_cfdi;
		this.codigo = codigo;
		this.nombre = nombre;

	}

	public Long getId_cfdi() {
		return id_cfdi;
	}

	public void setId_cfdi(Long id_cfdi) {
		this.id_cfdi = id_cfdi;
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

	@Override
	public String toString() {
		return "Cfdi [id_cfdi=" + id_cfdi + ", codigo=" + codigo + ", nombre=" + nombre + ", odc=" + "]";
	}

}
