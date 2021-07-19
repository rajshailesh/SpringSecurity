package com.cdfi.security.repository;

import java.util.Optional;

import com.cdfi.security.models.ERole;
import com.cdfi.security.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
