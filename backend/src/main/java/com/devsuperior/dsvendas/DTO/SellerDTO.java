package com.devsuperior.dsvendas.DTO;

import java.io.Serializable;

import com.devsuperior.dsvendas.model.Seller;

public class SellerDTO implements Serializable {
     
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;

	public SellerDTO(String name, Long id) {
		this.name = name;
		this.id = id;;
	}
	
	public SellerDTO() { 
	}
	
	public SellerDTO(Seller entity) { 
		id = entity.getId();
		name = entity.getName();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
