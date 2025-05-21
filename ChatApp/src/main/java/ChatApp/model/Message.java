package ChatApp.model;

public class Message {

    private String content;
    private User sender;
    private User Receiver;

    public Message(User receiver, User sender, String content) {
        Receiver = receiver;
        this.sender = sender;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return Receiver;
    }
}
