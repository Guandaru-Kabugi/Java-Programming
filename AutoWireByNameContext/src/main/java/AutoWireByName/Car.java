package AutoWireByName;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    //auto wiring by name
//    @Autowired
   private Engine dieselEngine;

    //autowiring by constructor
//    @Autowired
//    public Car(DieselEngine engine){
//        this.dieselEngine = engine;
//    }

    //NO AUTO WIRING. USING SETTERS


    public void setDieselEngine(Engine dieselEngine) {
        this.dieselEngine = dieselEngine;
    }

    public void drive(){
        System.out.println(dieselEngine.start());
    }
}
