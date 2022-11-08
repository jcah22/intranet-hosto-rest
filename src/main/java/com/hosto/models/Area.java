package com.hosto.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Area implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_area;

	private String nombre;

	@OneToMany(mappedBy = "area")
	private List<Usuario> usuario;

	

	public Area() {

	}

	public Area(Long id_area, String nombre, List<Usuario> usuario) {
		this.id_area = id_area;
		this.nombre = nombre;
		this.usuario = usuario;

	}

	public Long getId_area() {
		return id_area;
	}

	public void setId_area(Long id_area) {
		this.id_area = id_area;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(List<Usuario> usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Area [id_area=" + id_area + ", nombre=" + nombre + ", usuario=" + usuario + ", odc=" + "]";
	}

}
