import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class OrderTest {

    @Test
    public void calcularValorTotalDoPedido() {
        Customer customer = new Customer("1", "Lucas");
        Product product = new Product("1", "Celular", 50.0f);

        Order order = new Order(customer, product, 2);

        assertEquals(100.0f, order.getOrderAmount());
    }
}
