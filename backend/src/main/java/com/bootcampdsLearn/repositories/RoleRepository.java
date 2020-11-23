package com.bootcampdsLearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcampdsLearn.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

}
