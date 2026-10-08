package com.example.msnotification.service;

import com.example.msnotification.dto.NotificationRequestDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class NotificationService {
    public void sendNotification(NotificationRequestDto notificationRequestDto) {
        log.info("Notification sent to phone number: {}. Message: {}",
                notificationRequestDto.getPhoneNumber(),
                notificationRequestDto.getMessage());
    }
}
