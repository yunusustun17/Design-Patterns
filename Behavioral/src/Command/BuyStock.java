package Command;

public class BuyStock implements IOrderCommand {
    private StockManager stockManager;

    public BuyStock(StockManager stockManager) {
        this.stockManager = stockManager;
    }

    @Override
    public void execute() {
        stockManager.buy();
    }
}
