package com.bootcampdsLearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcampdsLearn.entities.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Long>{

}
