package com.hosto.service;

import java.util.List;

import com.hosto.models.Usuario;

public interface IUsuarioService {

	public List<Usuario> listarTodos();

	public void guardarUsuario(Usuario usuario);

	public Usuario buscarPorId(Long id);

	public Usuario actualizarUsuario(Usuario usuario);

	public void eliminar(Long id);

}
