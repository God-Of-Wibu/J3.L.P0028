package com.narga.salon_nails.service;

import java.util.List;

import com.narga.salon_nails.entity.Contact;

public interface IContactService {
	List<Contact> getNewestContact();
}
