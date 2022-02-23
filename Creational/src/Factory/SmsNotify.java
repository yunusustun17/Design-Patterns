package Factory;

public class SmsNotify implements INotify{
    @Override
    public void sendNotification(User user) {
        System.out.println("SMS sending..");
    }
}
