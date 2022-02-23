package AbstractFactory;

public class MySQLConnection extends Connection{
    @Override
    public Boolean openConnection() {
        return true;
    }

    @Override
    public Boolean closeConnection() {
        return true;
    }
}
