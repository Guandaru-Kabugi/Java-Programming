package eu.tutorials;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
@SpringBootApplication
public class Main {
//    public static void main(String[] args) {
//        ApplicationContext myAppContext = new AnnotationConfigApplicationContext(AppConfig.class);
//        System.out.println("Hello there");
//        for (String beanName: myAppContext.getBeanDefinitionNames()){
//            System.out.println(beanName);
//        }
//        NotificationService notificationService = myAppContext.getBean(NotificationService.class);
//
//        notificationService.notifyUser(("example@gmail.com"));
//    }
public static void main(String[] args) {
    SpringApplication.run(Main.class,args);
    }
}
