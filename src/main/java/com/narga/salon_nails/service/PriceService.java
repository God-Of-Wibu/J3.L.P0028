package com.narga.salon_nails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.narga.salon_nails.entity.Price;
import com.narga.salon_nails.repository.IPriceRepository;

@Service
public class PriceService implements IPriceService{
	
	@Autowired
	private IPriceRepository priceRepository;

	@Override
	public List<Price> getAll() {
		return (List<Price>) priceRepository.findAll();
	}

}
