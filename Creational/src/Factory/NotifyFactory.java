package Factory;

public class NotifyFactory {
    public INotify CreateNotify(String notifyType) {
        if (notifyType.equals("SMS")) {
            return new SmsNotify();
        } else if (notifyType.equals("MAIL")) {
            return new MailNotify();
        }

        return null;
    }
}
