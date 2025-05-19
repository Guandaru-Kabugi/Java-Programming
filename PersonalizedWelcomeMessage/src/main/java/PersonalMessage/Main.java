package PersonalMessage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        //Message service bean
        MessageService messageService =
                context.getBean(MessageService.class);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String userName = scanner.nextLine();
        messageService.setUserName(userName);

        //greeting service bean and display personalized greetings
        GreetingService greetingService =
                context.getBean(GreetingService.class);
        //here is where injection is happening at the constructor level
        //the interface is implemented and requires the username
        String personalizedGreeting = greetingService.getGreetings();
        System.out.println(personalizedGreeting);

    }
}
