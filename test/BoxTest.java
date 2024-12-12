import static org.junit.Assert.*;
import org.junit.Test;

public class BoxTest {
    @Test
    public void testSetAndGet() {
        Box<String> box = new Box<>();
        box.set("Test String");
        assertEquals("Test String", box.get());
    }

    @Test
    public void testPrintBox() {
        Box<Integer> box = new Box<>();
        box.set(10);
        box.printBox();  // Output check via print statements
    }
}
