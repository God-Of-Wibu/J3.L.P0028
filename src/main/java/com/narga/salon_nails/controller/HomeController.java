package com.narga.salon_nails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.narga.salon_nails.service.IEntryService;

@Controller
public class HomeController {

	@Autowired
	private IEntryService entryService;

	@GetMapping("/")
	private String upLoadEntry(Model model) {
		model.addAttribute("introduction", entryService.getIntroduction());
		model.addAttribute("entry", entryService.getNewestEntry());
		return "home";
	}

}
