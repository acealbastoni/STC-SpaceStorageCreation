package com.mohamedabdelhamid.demo.dto;

public class FolderDTO {
    private Long id;
    private String name;
    
	public FolderDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

    public FolderDTO() {

	}

	// Getters and setters
    
    
    
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}