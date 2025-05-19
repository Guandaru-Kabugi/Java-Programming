package eu.tutorials;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        //create the application context and scan for components

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        //retrieve beans from context

        Car car = context.getBean(Car.class);

        //use the beans
        System.out.println("Starting the car...");
        car.drive();

    }
}
