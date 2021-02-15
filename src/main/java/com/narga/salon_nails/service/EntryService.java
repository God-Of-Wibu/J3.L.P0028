package com.narga.salon_nails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.narga.salon_nails.entity.Entry;
import com.narga.salon_nails.repository.IEntryRepository;

@Service
public class EntryService implements IEntryService{
	
	@Autowired
	private IEntryRepository entryRepository;
	


	@Override
	public List<Entry> getNewestEntry() {
		return entryRepository.findByType("ENTRY", PageRequest.of(0, 2, Sort.by("date").descending()));
	}


	@Override
	public  List<Entry> getIntroduction() {
		return entryRepository.findByType("INTRODUCTION", PageRequest.of(0, 1, Sort.by("date").descending()));
	}

}
