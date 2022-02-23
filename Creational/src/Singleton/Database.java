package Singleton;

public class Database {
    private static Database database;
    private static final Object _syncObject = new Object();

    private Database() {

    }

    public static Database getInstance() {
        if (database == null) {
            synchronized (_syncObject) {
                if (database == null) {
                    database = new Database();
                }
            }
        }
        return database;
    }
}
