package com.narga.salon_nails.converter;

import org.springframework.core.convert.converter.Converter;

import com.narga.salon_nails.entity.Entry;



public class StringToEntryTypeConverter implements Converter<String, Entry.Type>{
	public Entry.Type convert(String src) {
		return Entry.Type.valueOf(src.toUpperCase());
	}
}
