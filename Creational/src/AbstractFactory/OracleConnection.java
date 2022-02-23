package AbstractFactory;

public class OracleConnection extends Connection{
    @Override
    public Boolean openConnection() {
        return true;
    }

    @Override
    public Boolean closeConnection() {
        return true;
    }
}
