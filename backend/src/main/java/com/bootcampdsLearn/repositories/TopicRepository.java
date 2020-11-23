package com.bootcampdsLearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootcampdsLearn.entities.Topic;

@Repository
public interface TopicRepository extends JpaRepository<Topic, Long>{

}
