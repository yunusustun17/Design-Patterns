package AbstractFactory;

public class MySQLCommand extends Command {
    @Override
    public void executeCommand(String query) {
        System.out.println("MySQL command executing..");
    }
}
