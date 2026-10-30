package com.gestorinventario.GetInv.repository;

import com.gestorinventario.GetInv.entity.SucursalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SucursalRepository extends JpaRepository<SucursalEntity, Long> { }
