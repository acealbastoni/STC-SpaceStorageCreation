package com.mohamedabdelhamid.demo.model;

//import javax.persistence.*;
import jakarta.persistence.*;
@Entity
public class Permissions {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String userEmail;

	private String permissionLevel;

	@ManyToOne
	@JoinColumn(name = "group_id")
	private PermissionGroup permissionGroup;

	// Constructors

	public Permissions() {
		super();
	}

	public Permissions(Long id, String userEmail, String permissionLevel, PermissionGroup permissionGroup) {
		super();
		this.id = id;
		this.userEmail = userEmail;
		this.permissionLevel = permissionLevel;
		this.permissionGroup = permissionGroup;
	}

// getters, and setters

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

	public PermissionGroup getPermissionGroup() {
		return permissionGroup;
	}

	public void setPermissionGroup(PermissionGroup permissionGroup) {
		this.permissionGroup = permissionGroup;
	}

}
