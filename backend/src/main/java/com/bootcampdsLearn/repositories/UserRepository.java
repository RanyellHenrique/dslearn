package com.bootcampdsLearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcampdsLearn.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
