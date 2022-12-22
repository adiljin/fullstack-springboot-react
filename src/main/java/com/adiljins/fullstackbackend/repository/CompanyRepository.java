package com.adiljins.fullstackbackend.repository;

import com.adiljins.fullstackbackend.model.essential.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompanyRepository extends JpaRepository<Company,Long> {
    List<Company> findByNameContaining(String name);
}
