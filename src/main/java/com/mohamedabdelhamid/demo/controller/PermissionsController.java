package com.mohamedabdelhamid.demo.controller;

import com.mohamedabdelhamid.demo.service.PermissionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/permissions")
public class PermissionsController {
    
    private final PermissionsService permissionsService;
    
    @Autowired
    public PermissionsController(PermissionsService permissionsService) {
        this.permissionsService = permissionsService;
    }
    
    // Add methods to handle HTTP requests related to permissions
}
