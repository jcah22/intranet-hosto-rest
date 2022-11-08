package com.hosto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hosto.models.Directivo;

@Repository
public interface DirectivoRepository extends JpaRepository<Directivo, Long>{
	
	

}
