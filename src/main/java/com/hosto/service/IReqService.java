package com.hosto.service;

import java.util.List;

import com.hosto.models.Req;

public interface IReqService {

	public List<Req> listarTodos();

	public Req guardarReq(Req req);

	public Req buscarPorId(Long id);

	public void eliminar(Long id);

	public List<Req> findAllByQuery(String palabraClave);

	public List<Req> findAllByCodigo(String codigo);

}
