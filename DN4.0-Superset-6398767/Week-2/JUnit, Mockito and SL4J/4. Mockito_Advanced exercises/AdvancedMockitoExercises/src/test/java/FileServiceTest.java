import interfaces.FileReader;
import interfaces.FileWriter;
import org.junit.jupiter.api.Test;
import service.FileService;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


// Exercise 3: Mocking File I/O
public class FileServiceTest {
    @Test
    public void testServiceWithMockFileIO() {
        FileReader mockFileReader = mock(FileReader.class);
        FileWriter mockFileWriter = mock(FileWriter.class);

        when(mockFileReader.read()).thenReturn("Mock File Content");

        FileService fileService = new FileService(mockFileReader, mockFileWriter);
        String result = fileService.processFile();

        assertEquals("Processed Mock File Content", result);
    }
}
