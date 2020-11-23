package com.bootcampdsLearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootcampdsLearn.entities.Resource;

@Repository
public interface ResourceRepository extends JpaRepository<Resource, Long>{

}
