import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringTests {
    @Test
    void concatTest() {
        assertEquals("HelloWorld", "Hello" + "World");
    }
}
