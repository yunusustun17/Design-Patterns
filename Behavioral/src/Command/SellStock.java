package Command;

public class SellStock implements IOrderCommand {
    private StockManager stockManager;

    public SellStock(StockManager stockManager) {
        this.stockManager = stockManager;
    }

    @Override
    public void execute() {
        stockManager.sell();
    }
}
