package com.mohamedabdelhamid.demo.model;

//import javax.persistence.*;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class PermissionGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String groupName;
    
    @OneToMany(mappedBy = "permissionGroup")
    private List<Item> items;

        
	public PermissionGroup() {
	
	}

	public PermissionGroup(Long id, String groupName, List<Item> items) {
		super();
		this.id = id;
		this.groupName = groupName;
		this.items = items;
	}

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

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
    
}
