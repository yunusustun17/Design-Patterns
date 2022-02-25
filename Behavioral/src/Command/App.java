package Command;

public class App {
    public static void main(String[] args) {
        StockManager stockManager = new StockManager("iPhone", 200);

        BuyStock buyStock = new BuyStock(stockManager);
        SellStock sellStock = new SellStock(stockManager);

        StockController stockController = new StockController();

        stockController.takeOrder(buyStock);
        stockController.takeOrder(sellStock);
        stockController.takeOrder(sellStock);


        stockController.placeOrders();
    }
}
