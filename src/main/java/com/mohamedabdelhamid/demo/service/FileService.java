package com.mohamedabdelhamid.demo.service;

import com.mohamedabdelhamid.demo.dto.FileDTO;

public interface FileService {
    void createFile(Long folderId, FileDTO fileDTO);
    FileDTO getFileMetadata(Long fileId);
    FileDTO getFileContent(Long fileId);
}
