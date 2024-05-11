package com.mohamedabdelhamid.demo.service;

import com.mohamedabdelhamid.demo.model.Files;
import com.mohamedabdelhamid.demo.repository.FilesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilesService {
    
    private final FilesRepository filesRepository;
    
    @Autowired
    public FilesService(FilesRepository filesRepository) {
        this.filesRepository = filesRepository;
    }
    
    // Add methods to handle business logic related to files
}
