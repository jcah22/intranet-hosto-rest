package com.hosto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hosto.models.Cfdi;

@Repository
public interface CfdiRepository extends JpaRepository<Cfdi, Long>{

}
