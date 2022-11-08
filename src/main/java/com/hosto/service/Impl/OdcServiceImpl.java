package com.hosto.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hosto.models.Odc;
import com.hosto.repository.OdcRepository;
import com.hosto.service.IOdcService;

@Service
public class OdcServiceImpl implements IOdcService {

	@Autowired
	private OdcRepository odcrepository;

	@Override
	@Transactional(readOnly = true)
	public List<Odc> listarTodos() {

		return odcrepository.findAll();
	}

	@Override
	public Odc guardar(Odc odc) {
		return odcrepository.save(odc);

	}

	@Override
	public void eliminar(Long id) {

		odcrepository.deleteById(id);

	}

	@Override
	@Transactional(readOnly = true)
	public List<Odc> findAllByQuery(int palabraClave) {

		return odcrepository.findByOdcs(palabraClave);
	}

	@Override
	@Transactional(readOnly = true)
	public Odc buscarPorId(Long id) {

		return odcrepository.findById(id).orElse(null);
	}

	@Override
	public Odc actualizarOdc(Odc odc) {
		
		return null;
	}

}
