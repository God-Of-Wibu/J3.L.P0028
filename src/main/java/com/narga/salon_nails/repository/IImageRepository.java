package com.narga.salon_nails.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.narga.salon_nails.entity.Image;

@Repository
public interface IImageRepository extends CrudRepository<Image, Integer>{

}
