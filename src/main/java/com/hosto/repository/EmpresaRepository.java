package com.hosto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hosto.models.Empresa;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

}
