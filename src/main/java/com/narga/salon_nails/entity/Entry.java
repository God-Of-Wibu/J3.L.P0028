package com.narga.salon_nails.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Entry {
	public enum Type {
		INTRODUCTION, ENTRY;
	}

	@Id
	@Column(name = "id")
	@GeneratedValue
	private int id;

	@Column(name = "title")
	private String title;

	@Column(name = "description", columnDefinition = "nvarchar(1000)")
	private String description;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
	@JoinColumn(name = "image")
	private Image image;
	
	@Column(name = "date")
	private Date date;

	public Entry(int id, String title, String description, Image image, Type type, Date date) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.image = image;
		this.type = type;
		this.date = date;
	}

	@Enumerated(EnumType.STRING)
	@Column(name = "type")
	private Type type;

}
