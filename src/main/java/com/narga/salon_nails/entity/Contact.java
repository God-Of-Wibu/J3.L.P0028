package com.narga.salon_nails.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Contact {

	@Id
	@Column(name = "id")
	@GeneratedValue
	private int id;

	@Column(name = "address")
	private String address;

	@Column(name = "city")
	private String city;

	@Column(name = "country")
	private String country;

	@Column(name = "phone")
	private Integer phone;

	@Column(name = "email")
	private String email;

	@Column(name = "timeOfWeek")
	private String workingTimeDayOfWeek;

	@Column(name = "timeOfWeeked")
	private String workingTimeDayOfWeekend;

	@Column(name = "date")
	private Date date;
}
