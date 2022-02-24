package Bridge;

public class App {
    public static void main(String[] args) {
        IMessageSender textMessageSender = new TextMessageSender();
        Message textMessage = new TextMessage(textMessageSender);
        textMessage.send();

        IMessageSender emailMessageSender = new EmailMessageSender();
        Message emailMessage = new EmailMessage(emailMessageSender);
        emailMessage.send();
    }
}
