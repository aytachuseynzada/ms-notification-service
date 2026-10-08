package com.example.msnotification.controller;

import com.example.msnotification.dto.NotificationRequestDto;
import com.example.msnotification.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.ACCEPTED;

@RestController
@RequiredArgsConstructor
@RequestMapping("/notifications")
public class NotificationController {
    private final NotificationService notificationService;

   @PostMapping
   @ResponseStatus(ACCEPTED)
   public void sendNotification(@RequestBody NotificationRequestDto notificationRequestDto) {
       notificationService.sendNotification(notificationRequestDto);
    }
}
