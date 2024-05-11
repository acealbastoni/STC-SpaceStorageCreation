package com.mohamedabdelhamid.demo.dto;

public class FileDTO {
    private Long id;
    private String name;
    private byte[] content;
    
    public FileDTO() {
		super();
	}
	
    public FileDTO(Long id, String name, byte[] content) {
		super();
		this.id = id;
		this.name = name;
		this.content = content;
	}
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
	public byte[] getContent() {
		return content;
	}
	public void setContent(byte[] content) {
		this.content = content;
	}
}