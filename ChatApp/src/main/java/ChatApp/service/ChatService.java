package ChatApp.service;

import ChatApp.model.Message;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChatService {

    private List<Message> messageHistory = new ArrayList<>();

    //send message
    public void sendMessage(Message message){
        messageHistory.add(message);
        System.out.println(message.getSender().getName() +
                " sent '" + message.getContent() + "' to " +
                message.getReceiver().getName());
    }

    //display the message

    public void displayMessageHistory(){
        System.out.println("Chat History:");
        for (Message message: messageHistory){
            System.out.println(message.getSender().getName() +
                    " sent " + message.getContent() + " to " +
                    message.getReceiver().getName());
        }
    }


}
