package AbstractVsInterFaceRealWordExample;

public abstract class BaseMessageService implements MessageServiceInterFace {

    void logMessage(String message){
        System.out.println("Logging Messages " + message);
    }

}
