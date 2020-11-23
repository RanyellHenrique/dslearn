package com.bootcampdsLearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcampdsLearn.entities.Section;

public interface SectionRepository extends JpaRepository<Section, Long>{

}
