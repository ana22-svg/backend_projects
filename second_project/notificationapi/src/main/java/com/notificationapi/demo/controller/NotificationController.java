package com.notificationapi.demo.controller;

import com.notificationapi.demo.repository.NotificationRepository;
import com.notificationapi.demo.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import com.notificationapi.demo.entity.Notification;
import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class NotificationController {
    private final NotificationService notificationService;

    @PostMapping
    public Notification createNotification() {

        return notificationService.createNotifications(1L, "Task Assigned", "You have been assigned a task"
        );
    }
    @GetMapping("/")
    public List <Notification> readNotifications(){
        return notificationService.readnotifications();
    }


}
