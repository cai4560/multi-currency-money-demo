import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FrancTest {
    private Bank bank = new Bank();

    @Test
    public void test_one_franc_should_equal_one_franc() {
        assertEquals(Money.franc(1), Money.franc(1));
    }

    @Test
    public void test_two_franc_should_not_equal_one_franc() {
        assertNotEquals(Money.franc(2), Money.franc(1));
    }

    @Test
    public void test_one_franc_add_one_franc_should_equal_two_franc() {
        Money one = Money.franc(1);
        Money anotherOne = Money.franc(1);
        assertEquals(one.plus(anotherOne), Money.franc(2));
    }

    @Test
    public void test_one_franc_add_two_franc_should_equal_three_franc() {
        Money one = Money.franc(1);
        Money two = Money.franc(2);
        assertEquals(one.plus(two), Money.franc(3));
    }

    @Test
    public void test_one_franc_multiply_two_should_equal_two_franc() {
        Money one = Money.franc(1);
        assertEquals(one.multiply(2), Money.franc(2));
    }

    @Test
    public void test_two_franc_multiply_two_should_equal_four_franc() {
        Money two = Money.franc(2);
        assertEquals(two.multiply(2), Money.franc(4));
    }

    @Test
    public void test_one_franc_reduce_one_franc() {
        Money oneFranc = Money.franc(1);
        assertEquals(oneFranc, bank.reduce(oneFranc, Money.FRANC_CURRENCY));
    }

    @Test
    public void test_two_franc_reduce_two_franc() {
        Money twoFranc = Money.franc(2);
        assertEquals(twoFranc, bank.reduce(twoFranc, Money.FRANC_CURRENCY));
    }

    @Test
    public void test_two_franc_reduce_one_dollar() {
        Money twoFranc = Money.franc(2);
        assertEquals(Money.dollar(1), bank.reduce(twoFranc, Money.DOLLAR_CURRENCY));
    }
}
