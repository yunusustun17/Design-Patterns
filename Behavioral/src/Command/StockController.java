package Command;

import java.util.ArrayList;
import java.util.List;

public class StockController {
    private List<IOrderCommand> orderCommands;

    public StockController() {
        this.orderCommands = new ArrayList<>();
    }

    public void takeOrder(IOrderCommand command) {
        orderCommands.add(command);
    }

    public void placeOrders() {
        for (IOrderCommand command : orderCommands) {
            command.execute();
        }

        orderCommands.clear();
    }
}
