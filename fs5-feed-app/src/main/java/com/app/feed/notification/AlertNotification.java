package com.app.feed.notification;

import com.app.feed.notification.mail.MailNotificationService;
import com.app.feed.persistent.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class AlertNotification {

    @Autowired
    private EmployeeRepository repository;
    @Autowired
    private MailNotificationService mailNotificationService;

    @Scheduled(cron = "*/20 * * * * ?")
    public void checkForInvalidData() {

        if (repository.invalidCount() != 0) {
            System.out.println("Notifiction started");
            mailNotificationService.sendMail();
        }
    }
}
