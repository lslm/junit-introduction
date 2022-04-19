import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class OrderDB {
    private List<Order> orders = new ArrayList<>();

    public void saveOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }

    public String getTotalRevenue() {
        DecimalFormat df = new DecimalFormat("0.00");
        float totalRevenue = 0.0f;

        for(Order order : orders) {
            totalRevenue += order.getOrderAmount();
        }

        totalRevenue = totalRevenue *1.20f;

        return df.format(totalRevenue);
    }
}
