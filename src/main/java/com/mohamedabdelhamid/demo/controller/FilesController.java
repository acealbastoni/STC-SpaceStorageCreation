package com.mohamedabdelhamid.demo.controller;

import com.mohamedabdelhamid.demo.service.FilesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/files")
public class FilesController {
    
    private final FilesService filesService;
    
    @Autowired
    public FilesController(FilesService filesService) {
        this.filesService = filesService;
    }
    
    // Add methods to handle HTTP requests related to files
}
