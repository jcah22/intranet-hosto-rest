package com.hosto.service;

import java.util.List;

import com.hosto.models.Proveedor;

public interface IProveedorService {

    public List<Proveedor> listarTodos();

	public Proveedor guardarReq(Proveedor proveedor);

	public Proveedor buscarPorId(Long id);

	public void eliminar(Long id);
    
}
