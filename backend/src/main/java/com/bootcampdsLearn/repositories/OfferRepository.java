package com.bootcampdsLearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcampdsLearn.entities.Offer;

public interface OfferRepository extends JpaRepository<Offer, Long>{

}
