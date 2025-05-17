package SetterDependency;

public class GreetingServiceImplementation implements GreetingService{
    private MessageService messageService;

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public void sendGreeting() {
        if(messageService !=null){
            System.out.println("Message Service is initialized.");
            System.out.println(messageService.getMessage());

        }else{
            System.out.println("Message service is not initialized.");
        }

    }
}
