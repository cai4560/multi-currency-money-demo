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

    @Test
    public void test_one_dollar_add_one_dollar_should_equal_two_dollar() {
        Dollar one = new Dollar(1);
        Dollar anotherOne = new Dollar(1);
        assertEquals(one.plus(anotherOne), new Dollar(2));
    }

    @Test
    public void test_one_dollar_add_two_dollar_should_equal_three_dollar() {
        Dollar one = new Dollar(1);
        Dollar two = new Dollar(2);
        assertEquals(one.plus(two), new Dollar(3));
    }

    @Test
    public void test_one_dollar_multiply_two_should_equal_two_dollar() {
        Dollar one = new Dollar(1);
        assertEquals(one.multiply(2), new Dollar(2));
    }

    @Test
    public void test_two_dollar_multiply_two_should_equal_four_dollar() {
        Dollar two = new Dollar(2);
        assertEquals(two.multiply(2), new Dollar(4));
    }
}
