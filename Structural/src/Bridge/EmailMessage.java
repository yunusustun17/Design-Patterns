package Bridge;

public class EmailMessage extends Message {
    public EmailMessage(IMessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send() {
        messageSender.sendMessage(this);
    }
}
