package com.mohamedabdelhamid.demo.controller;

import com.mohamedabdelhamid.demo.dto.SpaceDTO;
import com.mohamedabdelhamid.demo.model.Space;
import com.mohamedabdelhamid.demo.service.SpaceService;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/spaces")
public class SpaceController {

    private final SpaceService spaceService;

    @Autowired
    public SpaceController(SpaceService spaceService) {
        this.spaceService = spaceService;
    }
  
    
//    
//    @PostMapping("/create")
//    public ResponseEntity<SpaceDTO> createSpace(@RequestBody SpaceDTO spaceDTO) {
//        Space createdSpace = SpaceService.createSpace(spaceDTO);
//        SpaceDTO createdSpaceDTO = new SpaceDTO();
//        BeanUtils.copyProperties(createdSpace, createdSpaceDTO);
//        return ResponseEntity.status(HttpStatus.CREATED).body(createdSpaceDTO);
//    }
    @PostMapping("/create")
    public ResponseEntity<?> createSpace(@RequestBody SpaceDTO spaceDTO) {
        spaceService.createSpace(spaceDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    
    
    
    
    
    
}
