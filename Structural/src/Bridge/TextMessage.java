package Bridge;

public class TextMessage extends Message {
    public TextMessage(IMessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send() {
        messageSender.sendMessage(this);
    }
}
