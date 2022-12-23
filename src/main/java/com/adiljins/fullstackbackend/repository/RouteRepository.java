package com.adiljins.fullstackbackend.repository;

import com.adiljins.fullstackbackend.model.routes_management.Route;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RouteRepository extends JpaRepository<Route,Long> {
}
