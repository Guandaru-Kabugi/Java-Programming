package ChatApp;

import ChatApp.controller.ChatController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {
    @Autowired
    private ChatController chatController;
    public static void main(String[] args) {

        SpringApplication.run(Main.class,args);

    }

    //provides startup logic
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Command line runner");
        chatController.startChat();

    }
}
