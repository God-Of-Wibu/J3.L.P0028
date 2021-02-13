package com.narga.salon_nails.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Service {

	@Id
	@Column(name = "id")
	@GeneratedValue
	private Integer id;
	
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
