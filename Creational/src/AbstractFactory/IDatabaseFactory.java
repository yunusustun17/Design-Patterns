package AbstractFactory;

public interface IDatabaseFactory {
    Connection createConnection();

    Command createCommand();
}
