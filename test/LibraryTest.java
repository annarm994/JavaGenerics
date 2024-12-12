import static org.junit.Assert.*;
import org.junit.Test;

public class LibraryTest {
    @Test
    public void testAddAndFindItem() {
        Library<String> library = new Library<>();
        library.addItem("The Catcher in the Rye");
        assertEquals("The Catcher in the Rye", library.findItemByName("The Catcher in the Rye"));
    }
}
