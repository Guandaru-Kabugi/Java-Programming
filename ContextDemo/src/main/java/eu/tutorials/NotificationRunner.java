package eu.tutorials;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class NotificationRunner implements CommandLineRunner {
    private final NotificationService notificationService;

    public NotificationRunner(NotificationService notificationService) {
        this.notificationService = notificationService;
    }


    @Override
    public void run(String... args) throws Exception {
        notificationService.notifyUser("user@example.com");

    }
}
