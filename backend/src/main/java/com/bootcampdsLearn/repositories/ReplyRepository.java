package com.bootcampdsLearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootcampdsLearn.entities.Reply;

@Repository
public interface ReplyRepository extends JpaRepository<Reply, Long>{

}
