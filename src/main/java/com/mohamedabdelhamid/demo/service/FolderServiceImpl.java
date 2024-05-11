package com.mohamedabdelhamid.demo.service;

import com.mohamedabdelhamid.demo.dto.FolderDTO;
import com.mohamedabdelhamid.demo.model.Folder;
import com.mohamedabdelhamid.demo.repository.FolderRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FolderServiceImpl implements FolderService {

    private final FolderRepository folderRepository;

    @Autowired
    public FolderServiceImpl(FolderRepository folderRepository) {
        this.folderRepository = folderRepository;
    }

    @Override
    public void createFolder(Long spaceId, FolderDTO folderDTO) {
        Folder folder = new Folder();
        // Set properties and perform validation
        folderRepository.save(folder);
    }
}
