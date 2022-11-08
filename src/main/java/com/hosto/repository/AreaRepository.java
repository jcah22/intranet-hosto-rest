package com.hosto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hosto.models.Area;

@Repository
public interface AreaRepository extends JpaRepository<Area, Long> {

}
