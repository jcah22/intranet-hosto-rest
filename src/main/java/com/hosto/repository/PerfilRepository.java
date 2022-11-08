package com.hosto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hosto.models.Perfil;

@Repository
public interface PerfilRepository extends JpaRepository<Perfil,Long>{



    
}
