package AbstractVsInterFaceRealWordExample;

public class SmsService extends BaseMessageService{
    @Override
    public void sendMessage(String message, String recipient) {
        logMessage(message);
        System.out.println("Sending Sms to " + recipient + " with message: " + message);
    }
}
