package com.bootcampdsLearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcampdsLearn.entities.Topic;

public interface TopicRepository extends JpaRepository<Topic, Long>{

}
