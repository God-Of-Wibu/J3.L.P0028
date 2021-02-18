package com.narga.salon_nails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.narga.salon_nails.service.IPriceService;

@Controller
public class PriceListController {
	@Autowired
	private IPriceService priceService;

	@GetMapping("/")
	private String upLoadPriceService(Model model) {
		model.addAttribute("price", priceService.getAll());
		return "service";
	}
}
