package PersonalMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalTime;

@Service
public class TimeBasedGreetingService implements GreetingService{

    private final MessageService messageService;

    //constructor
    @Autowired
    public TimeBasedGreetingService(MessageService messageService){
        this.messageService = messageService;
    }

    @Override
    public String getGreetings() {
        String userName = messageService.getUserName();
        LocalTime currentTime = LocalTime.now();
        String greeting;
        if(currentTime.isBefore(LocalTime.NOON)){
            greeting = "Good morning";
        } else if (currentTime.isBefore(LocalTime.of(18,0))) {
            greeting = "Good Afternoon";

        } else{
            greeting = "Good Evening";
        }
        return greeting + ", " + userName + "!";
    }
}
