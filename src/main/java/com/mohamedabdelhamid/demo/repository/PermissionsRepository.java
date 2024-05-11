package com.mohamedabdelhamid.demo.repository;

import com.mohamedabdelhamid.demo.model.Permissions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionsRepository extends JpaRepository<Permissions, Long> {
    // Add custom query methods if needed
}
