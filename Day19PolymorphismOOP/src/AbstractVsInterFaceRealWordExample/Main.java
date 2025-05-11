package AbstractVsInterFaceRealWordExample;

public class Main {
    public static void main(String[] args){
        MessageServiceInterFace emailService = new EmailService();
        MessageServiceInterFace smsService = new SmsService();

        emailService.sendMessage("Hello There","james@gmail.com");
        smsService.sendMessage("Hi there via sms","0710111111");

    }
}
