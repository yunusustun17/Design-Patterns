package AbstractFactory;

public class CustomOperation {
    IDatabaseFactory databaseFactory;
    Connection connection;
    Command command;

    public CustomOperation(IDatabaseFactory databaseFactory) {
        this.databaseFactory = databaseFactory;
        this.connection = databaseFactory.createConnection();
        this.command = databaseFactory.createCommand();
    }

    public void removeById(int id) {
        connection.openConnection();
        command.executeCommand("DELETE...");
        connection.closeConnection();
    }
}
