import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class BalancedWordsCounterTest {

    @Test
    public void testCount() {
        BalancedWordsCounter counter = new BalancedWordsCounter();

        assertEquals(28, counter.count("aabbabcccba"));
        assertEquals(0, counter.count(""));

        try {
            counter.count(null);
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            assertEquals("Input cannot be null", e.getMessage());
        }

        try {
            counter.count("abababa1");
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            assertEquals("Input should contain only letters", e.getMessage());
        }
    }
}