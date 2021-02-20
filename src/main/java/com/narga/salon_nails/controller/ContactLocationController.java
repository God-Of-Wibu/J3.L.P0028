package com.narga.salon_nails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.narga.salon_nails.service.IContactService;

@Controller
public class ContactLocationController {

	@Autowired
	private IContactService contactService;

	@GetMapping("/")
	public String locationContact(Model model) {
		model.addAttribute("contact", contactService.getNewestContact());
		return "contact";
	}
}
