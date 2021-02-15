package com.narga.salon_nails.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.narga.salon_nails.entity.Entry;


@Repository
public interface IEntryRepository extends CrudRepository<Entry, Integer> {
		List<Entry> findByType(String type, Pageable pageable);
}
