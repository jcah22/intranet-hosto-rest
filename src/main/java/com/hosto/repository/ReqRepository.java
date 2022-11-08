package com.hosto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hosto.models.Req;

@Repository
public interface ReqRepository extends JpaRepository<Req, Long> {

	@Query(

			value = "select * from req WHERE req.codigo LIKE :filtro%", nativeQuery = true)

	List<Req> searchFiltroRepository(String filtro);

	List<Req> findByCodigo(String codigo);

}
