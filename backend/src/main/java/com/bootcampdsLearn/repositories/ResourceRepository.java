package com.bootcampdsLearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcampdsLearn.entities.Resource;

public interface ResourceRepository extends JpaRepository<Resource, Long>{

}
