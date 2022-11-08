package com.hosto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hosto.models.Status;

@Repository
public interface EstatusRepository extends JpaRepository<Status, Long> {

}
