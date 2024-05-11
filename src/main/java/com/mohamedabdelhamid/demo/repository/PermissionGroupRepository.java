package com.mohamedabdelhamid.demo.repository;

import com.mohamedabdelhamid.demo.model.PermissionGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionGroupRepository extends JpaRepository<PermissionGroup, Long> {
    // Add custom query methods if needed
}
