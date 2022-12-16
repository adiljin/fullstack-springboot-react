package com.adiljins.fullstackbackend.repository;

import com.adiljins.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
