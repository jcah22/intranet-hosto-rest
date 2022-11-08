package com.hosto.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hosto.models.Area;
import com.hosto.repository.AreaRepository;
import com.hosto.service.IAreaService;

@Service
public class AreaServiceImpl implements IAreaService {

	@Autowired
	private AreaRepository arearepository;

	@Override
	public List<Area> listarTodos() {

		return arearepository.findAll();
	}

	@Override
	public void guardar(Area area) {

	}

	@Override
	public Area buscarPorId(Long id) {

		return null;
	}

	@Override
	public void eliminar(Long id) {

	}

}
