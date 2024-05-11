package com.mohamedabdelhamid.demo.dto;

import com.mohamedabdelhamid.demo.model.Permissions;
import com.mohamedabdelhamid.demo.model.PermissionGroup;

public class PermissionsDTO {
    
    private Long id;
    private String userEmail;
    private String permissionLevel;
    private Long permissionGroupId;

    // Constructors, getters, and setters

    public PermissionsDTO() {
    }

    public PermissionsDTO(Permissions permissions) {
        this.id = permissions.getId();
        this.userEmail = permissions.getUserEmail();
        this.permissionLevel = permissions.getPermissionLevel();
        if (permissions.getPermissionGroup() != null) {
            this.permissionGroupId = permissions.getPermissionGroup().getId();
        }
    }

    // Getters and setters
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getPermissionLevel() {
		return permissionLevel;
	}

	public void setPermissionLevel(String permissionLevel) {
		this.permissionLevel = permissionLevel;
	}

	public Long getPermissionGroupId() {
		return permissionGroupId;
	}

	public void setPermissionGroupId(Long permissionGroupId) {
		this.permissionGroupId = permissionGroupId;
	}


}
