package Bridge;

public class EmailMessageSender implements IMessageSender {
    @Override
    public void sendMessage(Message message) {
        System.out.println("EmailMessageSender: Sending email message..");
    }
}
