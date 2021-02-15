package com.narga.salon_nails.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.narga.salon_nails.entity.Contact;

@Repository
public interface IContactRepository extends CrudRepository<Contact, Integer>{
	List<Contact> findAll(Pageable pageable);
}
