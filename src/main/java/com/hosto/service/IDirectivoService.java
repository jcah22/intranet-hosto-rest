package com.hosto.service;

import java.util.List;

import com.hosto.models.Directivo;

public interface IDirectivoService {

	public List<Directivo> listarTodos();

	public void guardar(Directivo directivo);

	public Directivo buscarPorId(Long id);

	public void eliminar(Long id);

}
