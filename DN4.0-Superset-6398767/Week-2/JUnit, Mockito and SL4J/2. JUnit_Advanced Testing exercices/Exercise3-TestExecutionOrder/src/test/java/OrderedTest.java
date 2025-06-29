import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OrderedTest {
    @Test
    @Order(1)
    void testA() {
        assertTrue(true);
    }

    @Test
    @Order(2)
    void testB() {
        assertEquals(5, 2 + 3);
    }

    @Test
    @Order(3)
    void testC() {
        assertNotNull(new Object());
    }
}
