package com.narga.salon_nails.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.CascadeType;
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
    
	@Column(name = "content", columnDefinition = "nvarchar(1000)")
    private String content;
    
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
	@JoinColumn(name = "image")
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
    
    @Enumerated(EnumType.STRING)
	@Column(name = "type")
    private Type type;
    
}
