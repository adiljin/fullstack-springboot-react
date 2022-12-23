package com.adiljins.fullstackbackend.repository;

import com.adiljins.fullstackbackend.model.essential.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
