package com.hosto.service;

import java.util.List;

import com.hosto.models.Cfdi;

public interface ICfdiService {

	public List<Cfdi> listarTodos();

	public void guardar(Cfdi cfdi);

	public Cfdi buscarPorId(Long id);

	public void eliminar(Long id);
}
