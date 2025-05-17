package SetterDependency;

public class Main {
    public static void main(String[] args) {
        GreetingServiceImplementation greetingServiceImplementation = new GreetingServiceImplementation();
        MessageService messageService = new MessageService();

        //setter dependency injection

        greetingServiceImplementation.setMessageService(messageService);
        greetingServiceImplementation.sendGreeting();
    }
}
