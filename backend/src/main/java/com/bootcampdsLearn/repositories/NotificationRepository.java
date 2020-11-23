package com.bootcampdsLearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcampdsLearn.entities.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long>{

}
