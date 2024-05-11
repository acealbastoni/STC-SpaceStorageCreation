package com.mohamedabdelhamid.demo.dto;

import com.mohamedabdelhamid.demo.model.Item;
import com.mohamedabdelhamid.demo.model.PermissionGroup;

public class ItemDTO {
    
    private Long id;
    private String type;
    private String name;
    private Long permissionGroupId;

    // Constructors, getters, and setters

    public ItemDTO() {
    }

    public ItemDTO(Item item) {
        this.id = item.getId();
        this.type = item.getType().toString();
        this.name = item.getName();
        if (item.getPermissionGroup() != null) {
            this.permissionGroupId = item.getPermissionGroup().getId();
        }
    }

    // Getters and setters
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPermissionGroupId() {
		return permissionGroupId;
	}

	public void setPermissionGroupId(Long permissionGroupId) {
		this.permissionGroupId = permissionGroupId;
	}


    
    
    
    
}
