package com.example.security.Spring_Security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.security.Spring_Security.model.AppRole;
import com.example.security.Spring_Security.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
    Optional<Role> findByRoleName(AppRole appRole);
}
