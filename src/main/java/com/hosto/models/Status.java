package com.hosto.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Status implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_status;

	private String nombre;

	public Status() {

	}

	public Status(Long id_status, String nombre) {
		this.id_status = id_status;
		this.nombre = nombre;

	}

	public Long getId_status() {
		return id_status;
	}

	public void setId_status(Long id_status) {
		this.id_status = id_status;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Status [id_status=" + id_status + ", nombre=" + nombre + ", odc=" + "]";
	}

}
