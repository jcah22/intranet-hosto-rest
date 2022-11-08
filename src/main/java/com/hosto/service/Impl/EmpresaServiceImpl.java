package com.hosto.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hosto.models.Empresa;
import com.hosto.repository.EmpresaRepository;
import com.hosto.service.IEmpresaService;

@Service
public class EmpresaServiceImpl implements IEmpresaService {

	@Autowired
	private EmpresaRepository empresaRepository;

	@Override
	public List<Empresa> listarTodos() {

		return empresaRepository.findAll();
	}

	@Override
	public void guardar(Empresa empresa) {

	}

	@Override
	public Empresa buscarPorId(Long id) {

		return null;
	}

	@Override
	public void eliminar(Long id) {

	}

}
