package AbstractVsInterFaceRealWordExample;

public class EmailService extends BaseMessageService{
    @Override
    public void sendMessage(String message, String recipient) {
        logMessage(message);
        System.out.println("Sending message: " + message +
                " to recipient: " + recipient);
    }
}
