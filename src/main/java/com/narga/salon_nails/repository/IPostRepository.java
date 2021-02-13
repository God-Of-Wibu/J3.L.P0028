package com.narga.salon_nails.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.narga.salon_nails.entity.Post;


@Repository
public interface IPostRepository extends CrudRepository<Post, Integer> {

}
