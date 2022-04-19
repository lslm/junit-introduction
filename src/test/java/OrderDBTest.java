import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class OrderDBTest {
    @Test
    public void testSaveOrder() {
        Customer customer = new Customer("1", "Lucas");
        Product product = new Product("1", "Celular", 50.0f);

        Order order = new Order(customer, product, 2);

        OrderDB orderDB = new OrderDB();
        orderDB.saveOrder(order);

        assertEquals(1, orderDB.getOrders().size());
    }

    @Test
    public void testOrderTotalRevenue() {
        Customer customer = new Customer("1", "Lucas");
        Product product1 = new Product("1", "Celular", 50.0f);
        Product product2 = new Product("2", "Computador", 100.0f);

        Order order1 = new Order(customer, product1, 2);
        Order order2 = new Order(customer, product2, 1);

        OrderDB orderDB = new OrderDB();
        orderDB.saveOrder(order1);
        orderDB.saveOrder(order2);

        assertEquals("240.00", orderDB.getTotalRevenue());
    }
}
