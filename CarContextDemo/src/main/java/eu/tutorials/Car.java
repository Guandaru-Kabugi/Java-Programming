package eu.tutorials;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    //autowiring by type
    @Autowired
    private Engine engine;

    public void drive(){
        System.out.println(engine.start());
    }
}
