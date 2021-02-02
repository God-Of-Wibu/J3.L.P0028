package com.narga.salon_nails.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name= "ContactLoaction")
public class Contact {

	private String address;
	
	private String city;
	
	private String country;
	
	private int tel;
	
	private String email;
	
}
