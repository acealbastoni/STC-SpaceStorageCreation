package com.mohamedabdelhamid.demo.service;

import com.mohamedabdelhamid.demo.model.PermissionGroup;
import com.mohamedabdelhamid.demo.repository.PermissionGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PermissionGroupService {
    
    private final PermissionGroupRepository permissionGroupRepository;
    
    @Autowired
    public PermissionGroupService(PermissionGroupRepository permissionGroupRepository) {
        this.permissionGroupRepository = permissionGroupRepository;
    }
    
    // Add methods to handle business logic related to permission groups
}
