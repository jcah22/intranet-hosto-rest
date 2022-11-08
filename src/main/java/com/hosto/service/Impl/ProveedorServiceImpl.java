package com.hosto.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hosto.models.Proveedor;
import com.hosto.repository.ProveedorRepository;
import com.hosto.service.IProveedorService;

@Service
public class ProveedorServiceImpl implements IProveedorService {

    @Autowired
    private ProveedorRepository proveedorrepo;

    @Override
    public List<Proveedor> listarTodos() {

        return proveedorrepo.findAll();
    }

    @Override
    public Proveedor guardarReq(Proveedor proveedor) {

        return null;
    }

    @Override
    public Proveedor buscarPorId(Long id) {

        return null;
    }

    @Override
    public void eliminar(Long id) {

    }

}
