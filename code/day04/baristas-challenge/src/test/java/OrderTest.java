import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    Order order;

    ArrayList<Item> items = new ArrayList<>();

    @BeforeEach
    void setUp() {
        order = new Order();
        items.addAll(Arrays.asList(
                new Item("mocha", 3.5),
                new Item("latte", 2.5),
                new Item("cappuccino", 3)
        ));
//        order.setItems(items);


    }

    @AfterEach
    void tearDown() {
        System.gc();
    }

    @Test
    void addItemTest() {
        order.addItem(items.get(0));
        assertEquals(order.getItems().get(0), items.get(0));
    }

    @Test
    void getStatusMessageTestForTrue() {
        order.setReady(true);
        String trueMessage = "Your order is ready.";
        assertEquals(order.getStatusMessage(), trueMessage);
    }

    @Test
    void getStatusMessageTestForFalse() {
        order.setReady(false);
        String falseMessage = "Thank you for waiting. Your order will be ready soon.";
        assertEquals(order.getStatusMessage(), falseMessage);
    }

    @Test
    void getOrderTotal() {
        order.setItems(items);
        assertEquals(order.getOrderTotal(), 9.0);
    }

    @Test
    void displayTest(){
        Order testOrder = new Order("Cindhuri");
        testOrder.addItem(new Item("drip coffee", 1.5));
        testOrder.addItem(new Item("capuccino", 3.5));
        String testMessage = """
                Customer Name: Cindhuri
                drip coffee - $1.50
                capuccino - $3.50
                Total: $5.00""";
        assertEquals(testOrder.display(), testMessage);

    }
}