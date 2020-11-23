package com.bootcampdsLearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcampdsLearn.entities.Reply;

public interface ReplyRepository extends JpaRepository<Reply, Long>{

}
