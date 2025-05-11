package InterFaceInAction;

public interface InterFaceNew {

    void turnOn();
    void turnOff();
    //default
    default void getStatus(){
        System.out.println("Status: Unknown");
    }
}
