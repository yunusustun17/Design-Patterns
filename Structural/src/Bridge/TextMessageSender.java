package Bridge;

public class TextMessageSender implements IMessageSender {
    @Override
    public void sendMessage(Message message) {
        System.out.println("TextMessageSender: Sending text message..");
    }
}
