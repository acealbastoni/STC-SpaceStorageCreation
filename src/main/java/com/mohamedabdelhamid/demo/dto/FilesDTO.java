package com.mohamedabdelhamid.demo.dto;

import com.mohamedabdelhamid.demo.model.Files;
import com.mohamedabdelhamid.demo.model.Item;

public class FilesDTO {

    private Long id;
    private byte[] binary;
    private Long itemId;

    // Constructors, getters, and setters

    public FilesDTO() {
    }

    public FilesDTO(Files files) {
        this.id = files.getId();
        this.binary = files.getBinary();
        if (files.getItem() != null) {
            this.itemId = files.getItem().getId();
        }
    }
    // Getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public byte[] getBinary() {
		return binary;
	}

	public void setBinary(byte[] binary) {
		this.binary = binary;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}


    
}
