package com.narga.salon_nails.controller.form_object;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NewEntryForm {

	String title;

	String description;

	MultipartFile image;

}
