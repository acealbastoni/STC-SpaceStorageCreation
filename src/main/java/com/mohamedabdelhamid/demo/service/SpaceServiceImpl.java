package com.mohamedabdelhamid.demo.service;

import com.mohamedabdelhamid.demo.dto.SpaceDTO;
import com.mohamedabdelhamid.demo.model.Space;
import com.mohamedabdelhamid.demo.repository.SpaceRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpaceServiceImpl implements SpaceService {

    private static  SpaceRepository spaceRepository;

    @Autowired
    public SpaceServiceImpl(SpaceRepository spaceRepository) {
        this.spaceRepository = spaceRepository;
    }

//    @Override
//    public void createSpace(SpaceDTO spaceDTO) {
//        Space space = new Space();
//        BeanUtils.copyProperties(spaceDTO, space);
//        // Set additional properties if needed
//        spaceRepository.save(space);
//    }
    
   @Override
    public Space createSpace(SpaceDTO spaceDTO) {
        Space space = new Space();
        BeanUtils.copyProperties(spaceDTO, space);
        // Set additional properties if needed
        return spaceRepository.save(space);
    }

}
