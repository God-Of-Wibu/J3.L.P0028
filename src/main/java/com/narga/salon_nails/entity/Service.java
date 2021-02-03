package com.narga.salon_nails.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "service")
public class Service {

	@Column(name= "nameService")
	private String nameService;
	
	@Column(name= "price")
	private float price;

	public Service(String nameService, float price) {
		super();
		this.nameService = nameService;
		this.price = price;
	}
	
}
