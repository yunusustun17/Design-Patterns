package AbstractFactory;

public class OracleCommand extends Command{
    @Override
    public void executeCommand(String query) {
        System.out.println("Oracle command executing..");
    }
}
