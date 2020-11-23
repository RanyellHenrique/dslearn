package com.bootcampdsLearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcampdsLearn.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

}
