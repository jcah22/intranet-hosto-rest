package com.hosto.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hosto.models.Status;
import com.hosto.repository.EstatusRepository;
import com.hosto.service.IStatusService;

@Service
public class StatusServiceImpl implements IStatusService {

	@Autowired
	private EstatusRepository estatusrepo;

	@Override
	public List<Status> listarTodos() {

		return estatusrepo.findAll();
	}

	@Override
	public void guardarReq(Status status) {

	}

	@Override
	public Status buscarPorId(Long id) {

		return null;
	}

	@Override
	public void eliminar(Long id) {

	}

}
