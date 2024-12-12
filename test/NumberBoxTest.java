import static org.junit.Assert.*;
import org.junit.Test;

public class NumberBoxTest {
    @Test
    public void testSetAndGet() {
        NumberBox<Double> numberBox = new NumberBox<>();
        numberBox.set(3.14);
        assertEquals(Double.valueOf(3.14), numberBox.get());
    }
}
