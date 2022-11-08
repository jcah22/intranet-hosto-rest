package com.hosto.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hosto.models.Directivo;
import com.hosto.repository.DirectivoRepository;
import com.hosto.service.IDirectivoService;

@Service
public class DirectivoServiceImpl implements IDirectivoService {

	@Autowired
	private DirectivoRepository directivorepository;

	@Override
	public List<Directivo> listarTodos() {

		return directivorepository.findAll();
	}

	@Override
	public void guardar(Directivo directivo) {

	}

	@Override
	public Directivo buscarPorId(Long id) {

		return null;
	}

	@Override
	public void eliminar(Long id) {

	}

}
