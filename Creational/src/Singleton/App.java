package Singleton;

public class App {
    public static void main(String[] args) {
        Database firstInstanceRequest = Database.getInstance();
        Database secondInstanceRequest = Database.getInstance();

        boolean isEquals = firstInstanceRequest == secondInstanceRequest;

        System.out.println(isEquals);
    }
}
