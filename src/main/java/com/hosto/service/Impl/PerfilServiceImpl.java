package com.hosto.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hosto.models.Perfil;
import com.hosto.repository.PerfilRepository;
import com.hosto.service.IPerfilService;

@Service
public class PerfilServiceImpl implements IPerfilService {

    @Autowired
    private PerfilRepository perfilrepo;

    @Override
    public List<Perfil> listarTodos() {

        return perfilrepo.findAll();
    }

    @Override
    public void guardar(Perfil perfil) {

    }

    @Override
    public Perfil buscarPorId(Long id) {

        return null;
    }

    @Override
    public void eliminar(Long id) {

    }

}
