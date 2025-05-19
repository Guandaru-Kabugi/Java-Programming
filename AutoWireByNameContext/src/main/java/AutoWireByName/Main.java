package AutoWireByName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        //retrieve the beans

        Car car = context.getBean(Car.class);

        car.setDieselEngine(context.getBean(DieselEngine.class));

        //use the beans
        System.out.println("Starting the car...");
        car.drive();

    }
}
