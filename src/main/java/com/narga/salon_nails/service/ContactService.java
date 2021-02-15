package com.narga.salon_nails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.narga.salon_nails.entity.Contact;
import com.narga.salon_nails.repository.IContactRepository;

@Service
public class ContactService implements IContactService{
	@Autowired
	private IContactRepository contactRepository;
	@Override
	public List<Contact> getNewestContact() {
		return contactRepository.findAll(PageRequest.of(0, 1, Sort.by("date").descending()));
	}

}
