package com.mohamedabdelhamid.demo.dto;

import com.mohamedabdelhamid.demo.model.PermissionGroup;

public class PermissionGroupDTO {
    
    private Long id;
    private String groupName;

    // Constructors, getters, and setters

    public PermissionGroupDTO() {
    }

    public PermissionGroupDTO(PermissionGroup permissionGroup) {
        this.id = permissionGroup.getId();
        this.groupName = permissionGroup.getGroupName();
    }
    // Getters and setters
    
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}


    
    
    
}
