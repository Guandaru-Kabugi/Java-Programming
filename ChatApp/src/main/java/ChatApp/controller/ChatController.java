package ChatApp.controller;

import ChatApp.model.Message;
import ChatApp.model.User;
import ChatApp.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Controller
public class ChatController {

    private final ChatService chatService;

    //constructor

    @Autowired
    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    public void startChat(){
        Scanner scanner = new Scanner(System.in);

        //from our model
        User user1 = new User("Alice");
        User user2 = new User("Bob");

        while(true){
            System.out.println("Who is sending the message, Alice or Bob?");
            String senderName = scanner.nextLine();
            System.out.println("Enter your message: ");
            String content = scanner.nextLine();

            //advanced if statement
            //if sender name not alice, user2 then is the alice
//            User sender;
//
//            if(senderName.equalsIgnoreCase("Alice")){
//                sender = user1;
//
//            } else if (senderName.equalsIgnoreCase("Bob")) {
//                sender = user2;
//
//            }else{
//                System.out.println("Only Bob or Alice");
//                return;
//            }

           User sender = senderName.equalsIgnoreCase("Alice") ? user1:user2;
           User receiver = senderName.equalsIgnoreCase("Bob") ? user1:user2;

            Message message = new Message(receiver,sender,content);
            chatService.sendMessage(message);

            System.out.println("Type 'history' to see history, 'continue' to send and 'exit' to exit chatservice");

            String command = scanner.nextLine();

            if(command.equalsIgnoreCase("history")){
                chatService.displayMessageHistory();
            } else if (command.equalsIgnoreCase("continue")) {
                continue;
            } else if (command.equalsIgnoreCase("exit")) {
                break;
            }else{
                System.out.println("Invalid command");
            }


        }

    }
}
