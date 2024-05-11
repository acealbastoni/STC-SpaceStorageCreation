package com.mohamedabdelhamid.demo.service;

import com.mohamedabdelhamid.demo.dto.FolderDTO;

public interface FolderService {
    void createFolder(Long spaceId, FolderDTO folderDTO);
}
