import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DollarTest {
    @Test
    public void test_one_dollar_should_equal_one_dollar() {
        assertEquals(new Dollar(1), new Dollar(1));
    }

    @Test
    public void test_two_dollar_should_not_equal_one_dollar() {
        assertNotEquals(new Dollar(2), new Dollar(1));
    }
}
