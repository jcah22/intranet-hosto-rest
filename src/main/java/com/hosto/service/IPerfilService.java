package com.hosto.service;

import java.util.List;

import com.hosto.models.Perfil;

public interface IPerfilService {

    public List<Perfil> listarTodos();

	public void guardar(Perfil perfil);

	public Perfil buscarPorId(Long id);

	public void eliminar(Long id);
    
}
