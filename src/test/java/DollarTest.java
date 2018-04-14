import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DollarTest {
    @Test
    public void test_one_dollar_should_equal_one_dollar() {
        assertEquals(Money.dollar(1), Money.dollar(1));
    }

    @Test
    public void test_two_dollar_should_not_equal_one_dollar() {
        assertNotEquals(Money.dollar(2), Money.dollar(1));
    }

    @Test
    public void test_one_dollar_add_one_dollar_should_equal_two_dollar() {
        Money one = Money.dollar(1);
        Money anotherOne = Money.dollar(1);
        assertEquals(one.plus(anotherOne), Money.dollar(2));
    }

    @Test
    public void test_one_dollar_add_two_dollar_should_equal_three_dollar() {
        Money one = Money.dollar(1);
        Money two = Money.dollar(2);
        assertEquals(one.plus(two), Money.dollar(3));
    }

    @Test
    public void test_one_dollar_multiply_two_should_equal_two_dollar() {
        Money one = Money.dollar(1);
        assertEquals(one.multiply(2), Money.dollar(2));
    }

    @Test
    public void test_two_dollar_multiply_two_should_equal_four_dollar() {
        Money two = Money.dollar(2);
        assertEquals(two.multiply(2), Money.dollar(4));
    }
}
