package com.narga.salon_nails.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "post")

public class Post {
	
	@Id
	@Column(name = "id")
	@GeneratedValue
	private int id;
	
	@Column(name = "title")
    private String title;
    
	@Column(name = "content")
    private String content;
    
    private Image image;


	public Post(int id, String title, String content, Image image, Type type) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.image = image;
		this.type= type;
	}
    
    public enum Type{
		IMAGE, ARTICLE;
	}
    
    private Type type;
    
}
