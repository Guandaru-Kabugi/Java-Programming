package eu.tutorials;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    @Autowired
    private MessageService emailService; //field dependency injection

    //we can use Autowired and remove constructor injection


//    //constructor injection
//    public NotificationService(MessageService emailService){
//        this.emailService = emailService;
//    }

    public void notifyUser(String userEmail){
        String subject = "Welcome";
        String body = "Thank you for registering";
        emailService.sendEmail(userEmail,subject,body);
    }
}
