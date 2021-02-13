package com.narga.salon_nails.converter;

import org.springframework.core.convert.converter.Converter;

import com.narga.salon_nails.entity.Post;



public class StringToPostTypeConverter implements Converter<String, Post.Type>{
	public Post.Type convert(String src) {
		return Post.Type.valueOf(src.toUpperCase());
	}
}
