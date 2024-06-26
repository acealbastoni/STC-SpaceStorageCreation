package com.mohamedabdelhamid.demo.model;

//import javax.persistence.*;
import jakarta.persistence.*;
@Entity
public class Files {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Lob
    @Column(name = "binary_data")
    private byte[] binary;
    
    @OneToOne
    @JoinColumn(name = "item_id")
    private Item item;

     // Constructors, getters, and setters
	public Files(Long id, byte[] binary, Item item) {
		super();
		this.id = id;
		this.binary = binary;
		this.item = item;
	}
	
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

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
}
