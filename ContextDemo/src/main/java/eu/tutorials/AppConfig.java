package eu.tutorials;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MessageService emailservice(){
        return new MessageService();
    }
    @Bean
    public NotificationService notificationService(){
        return new NotificationService();
    }

}
