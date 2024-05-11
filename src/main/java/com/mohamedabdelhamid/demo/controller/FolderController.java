package com.mohamedabdelhamid.demo.controller;

import com.mohamedabdelhamid.demo.dto.FolderDTO;
import com.mohamedabdelhamid.demo.service.FolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/spaces/{spaceId}/folders")
public class FolderController {

    private final FolderService folderService;

    @Autowired
    public FolderController(FolderService folderService) {
        this.folderService = folderService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> createFolder(@PathVariable Long spaceId, @RequestBody FolderDTO folderDTO) {
        folderService.createFolder(spaceId, folderDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
