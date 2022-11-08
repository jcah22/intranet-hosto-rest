package com.hosto.service;

import java.util.List;

import com.hosto.models.Area;

public interface IAreaService {

	public List<Area> listarTodos();

	public void guardar(Area area);

	public Area buscarPorId(Long id);

	public void eliminar(Long id);

}
