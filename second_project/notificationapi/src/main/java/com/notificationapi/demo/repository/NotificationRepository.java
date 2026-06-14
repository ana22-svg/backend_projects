package com.notificationapi.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.notificationapi.demo.entity.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {

}
