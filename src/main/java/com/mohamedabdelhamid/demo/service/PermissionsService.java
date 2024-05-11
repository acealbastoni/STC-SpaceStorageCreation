package com.mohamedabdelhamid.demo.service;

import com.mohamedabdelhamid.demo.model.Permissions;
import com.mohamedabdelhamid.demo.repository.PermissionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PermissionsService {
    
    private final PermissionsRepository permissionsRepository;
    
    @Autowired
    public PermissionsService(PermissionsRepository permissionsRepository) {
        this.permissionsRepository = permissionsRepository;
    }
    
    // Add methods to handle business logic related to permissions
}
