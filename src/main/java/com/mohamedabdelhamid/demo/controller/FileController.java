package com.mohamedabdelhamid.demo.controller;

import com.mohamedabdelhamid.demo.dto.FileDTO;
import com.mohamedabdelhamid.demo.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/folders/{folderId}/files")
public class FileController {

    private final FileService fileService;

    @Autowired
    public FileController(FileService fileService) {
        this.fileService = fileService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> createFile(@PathVariable Long folderId, @RequestBody FileDTO fileDTO) {
        fileService.createFile(folderId, fileDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{fileId}")
    public ResponseEntity<FileDTO> getFileMetadata(@PathVariable Long fileId) {
        FileDTO fileDTO = fileService.getFileMetadata(fileId);
        return ResponseEntity.ok(fileDTO);
    }
}
