package com.notificationapi.demo.service;

import com.notificationapi.demo.entity.Notification;
import com.notificationapi.demo.repository.NotificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public Notification createNotifications(
            Long userId,
            String title,
            String message
    ) {

        Notification notification = new Notification();

        notification.setUserId(userId);
        notification.setTitle(title);
        notification.setMessage(message);
        notification.setRead(false);
        notification.setCreatedAt(LocalDateTime.now());

        return notificationRepository.save(notification);
    }

    public List<Notification> readnotifications(){
        return notificationRepository.findAll();
    }
}