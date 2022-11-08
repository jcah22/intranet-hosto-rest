package com.hosto.service;

import java.util.List;

import com.hosto.models.Status;

public interface IStatusService {

	public List<Status> listarTodos();

	public void guardarReq(Status status);

	public Status buscarPorId(Long id);

	public void eliminar(Long id);

}
