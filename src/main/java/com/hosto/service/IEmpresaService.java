package com.hosto.service;

import java.util.List;

import com.hosto.models.Empresa;

public interface IEmpresaService {

	public List<Empresa> listarTodos();

	public void guardar(Empresa empresa);

	public Empresa buscarPorId(Long id);

	public void eliminar(Long id);

}
