package com.hosto.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hosto.models.Cfdi;
import com.hosto.repository.CfdiRepository;
import com.hosto.service.ICfdiService;

@Service
public class CfdiServiceImpl implements ICfdiService {

	@Autowired
	private CfdiRepository cfdirepository;

	@Override
	public List<Cfdi> listarTodos() {

		return cfdirepository.findAll();
	}

	@Override
	public void guardar(Cfdi cfdi) {

	}

	@Override
	public Cfdi buscarPorId(Long id) {

		return null;
	}

	@Override
	public void eliminar(Long id) {

	}

}
