package com.hosto.models;

import javax.persistence.Entity;

import javax.persistence.*;

@Entity
public class Perfil {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String perfil;

	public Perfil() {
	}

	public Perfil(Long id, String perfil) {
		this.id = id;
		this.perfil = perfil;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

}
