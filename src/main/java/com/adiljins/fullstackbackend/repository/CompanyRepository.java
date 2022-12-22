package com.adiljins.fullstackbackend.repository;

import com.adiljins.fullstackbackend.model.essential.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company,Long> {
}
