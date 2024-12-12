import static org.junit.Assert.*;
import org.junit.Test;

public class StringProcessorTest {
    @Test
    public void testProcess() {
        StringProcessor processor = new StringProcessor();
        assertEquals("gnicreG", processor.process("Generics"));
    }
}
