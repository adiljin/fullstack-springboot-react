package com.adiljins.fullstackbackend.repository;

import com.adiljins.fullstackbackend.model.ship.Cruise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CruiseRepository extends JpaRepository<Cruise,Long> {
}
