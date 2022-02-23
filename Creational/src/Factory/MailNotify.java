package Factory;

public class MailNotify implements INotify{
    @Override
    public void sendNotification(User user) {
        System.out.println("email sending..");
    }
}
