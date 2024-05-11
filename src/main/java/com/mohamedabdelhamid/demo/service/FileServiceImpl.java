package com.mohamedabdelhamid.demo.service;

import com.mohamedabdelhamid.demo.dto.FileDTO;
import com.mohamedabdelhamid.demo.model.File;
import com.mohamedabdelhamid.demo.repository.FileRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileServiceImpl implements FileService {

    private final FileRepository fileRepository;

    @Autowired
    public FileServiceImpl(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }

    @Override
    public void createFile(Long folderId, FileDTO fileDTO) {
        File file = new File();
        // Set properties and perform validation
        fileRepository.save(file);
    }

    @Override
    public FileDTO getFileMetadata(Long fileId) {
        File file = fileRepository.findById(fileId).orElse(null);
        if (file != null) {
            FileDTO fileDTO = new FileDTO();
            BeanUtils.copyProperties(file, fileDTO);
            return fileDTO;
        }
        return null;
    }

    @Override
    public FileDTO getFileContent(Long fileId) {
        File file = fileRepository.findById(fileId).orElse(null);
        if (file != null) {
            FileDTO fileDTO = new FileDTO();
            BeanUtils.copyProperties(file, fileDTO);
            fileDTO.setContent(file.getContent()); // Assuming getContent() returns byte[]
            return fileDTO;
        }
        return null;
    }
}
