package com.notificationapi.demo.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class NotificationResponse {


    private Long id;

    private Long userId;

    private String title;

    private String message;

    private Boolean read;

    private LocalDateTime createdAt;

}
