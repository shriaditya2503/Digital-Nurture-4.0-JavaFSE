import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    // Exercise 1: Mocking and Stubbing
    @Test
    void testExternalApi() {
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("Mock Data");

        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        assertEquals("Mock Data", result);
    }

    // Exercise 2: Verifying Interactions
    @Test
    void testVerifyInteraction() {
        ExternalApi mockApi = mock(ExternalApi.class);

        MyService service = new MyService(mockApi);
        service.fetchData();

        verify(mockApi).getData(); // Verifies it was called once
    }

    // Exercise 3: Argument Matching
    @Test
    void testArgumentMatching() {
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);

        service.processAndSend("hello");

        verify(mockApi).sendData(eq("HELLO")); // Argument matcher
    }

    // Exercise 4: Handling Void Methods
    @Test
    void testVoidMethod() {
        ExternalApi mockApi = mock(ExternalApi.class);
        doNothing().when(mockApi).sendData(anyString());

        MyService service = new MyService(mockApi);
        service.processAndSend("data");

        verify(mockApi).sendData("DATA");
    }

    // Exercise 5: Multiple Returns
    @Test
    void testMultipleReturns() {
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("First").thenReturn("Second");

        MyService service = new MyService(mockApi);

        assertEquals("First", service.fetchData());
        assertEquals("Second", service.fetchData());
    }

    // Exercise 6: Verifying Interaction Order

    @Test
    void testInteractionOrder() {
        ExternalApi mockApi = mock(ExternalApi.class);

        mockApi.sendData("first");
        mockApi.getData();

        InOrder order = inOrder(mockApi);
        order.verify(mockApi).sendData("first");
        order.verify(mockApi).getData();
    }

    // Exercise 7: Void Method Throwing Exception
    @Test
    void testVoidMethodThrowsException() {
        ExternalApi mockApi = mock(ExternalApi.class);
        doThrow(new RuntimeException("Failure")).when(mockApi).riskyOperation();

        MyService service = new MyService(mockApi);

        org.junit.jupiter.api.Assertions.assertThrows(RuntimeException.class, service::performRisky);
        verify(mockApi).riskyOperation();
    }
}
