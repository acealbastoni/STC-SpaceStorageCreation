package com.mohamedabdelhamid.demo.controller;

import com.mohamedabdelhamid.demo.dto.FileDTO;
import com.mohamedabdelhamid.demo.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/files")
public class FileDownloadController {

    private final FileService fileService;

    @Autowired
    public FileDownloadController(FileService fileService) {
        this.fileService = fileService;
    }

    @GetMapping("/{fileId}/download")
    public ResponseEntity<Resource> downloadFile(@PathVariable Long fileId) {
        // Retrieve file content from service
        FileDTO fileDTO = fileService.getFileContent(fileId);

        // Create a ByteArrayResource to wrap the file content
        ByteArrayResource resource = new ByteArrayResource(fileDTO.getContent());

        // Set the file name as the content disposition
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + fileDTO.getName());

        // Return ResponseEntity with the resource, headers, and OK status
        return ResponseEntity.ok()
                .headers(headers)
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .body(resource);
    }
}
