package Command;

public class StockManager {
    private String name;
    private int quantity;

    public StockManager(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void buy() {
        System.out.println("bought: " + name + " stock: " + quantity);
    }

    public void sell() {
        System.out.println("sold: " + name + " stock: " + quantity);
    }
}
