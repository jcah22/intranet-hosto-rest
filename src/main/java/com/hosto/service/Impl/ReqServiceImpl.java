package com.hosto.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hosto.models.Req;
import com.hosto.repository.ReqRepository;
import com.hosto.service.IReqService;

@Service
public class ReqServiceImpl implements IReqService {

	@Autowired
	private ReqRepository reqrepository;

	@Override
	public List<Req> listarTodos() {

		return reqrepository.findAll();
	}

	@Override
	public Req guardarReq(Req req) {

		return reqrepository.save(req);

	}

	@Override
	public Req buscarPorId(Long id) {

		return null;
	}

	@Override
	public void eliminar(Long id) {

	}

	@Override
	public List<Req> findAllByQuery(String palabraClave) {

		return reqrepository.searchFiltroRepository(palabraClave);
	}

	@Override
	public List<Req> findAllByCodigo(String codigo) {

		return reqrepository.findByCodigo(codigo);
	}

}
