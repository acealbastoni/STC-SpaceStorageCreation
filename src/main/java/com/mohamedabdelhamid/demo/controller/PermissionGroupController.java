package com.mohamedabdelhamid.demo.controller;

import com.mohamedabdelhamid.demo.service.PermissionGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/permission-groups")
public class PermissionGroupController {
    
    private final PermissionGroupService permissionGroupService;
    
    @Autowired
    public PermissionGroupController(PermissionGroupService permissionGroupService) {
        this.permissionGroupService = permissionGroupService;
    }
    
    // Add methods to handle HTTP requests related to permission groups
}
