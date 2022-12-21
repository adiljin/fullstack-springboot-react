package com.adiljins.fullstackbackend.repository;

import com.adiljins.fullstackbackend.model.ship.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CargoRepository extends JpaRepository<Cargo,Long> {
}
