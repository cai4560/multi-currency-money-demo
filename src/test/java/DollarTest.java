import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DollarTest {
    private Bank bank = new Bank();

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

    @Test
    public void test_one_dollar_reduce_one_dollar() {
        Money oneDollar = Money.dollar(1);
        assertEquals(oneDollar, bank.reduce(oneDollar, Money.DOLLAR_CURRENCY));
    }

    @Test
    public void test_two_dollar_reduce_two_dollar() {
        Money twoDollar = Money.dollar(2);
        assertEquals(twoDollar, bank.reduce(twoDollar, Money.DOLLAR_CURRENCY));
    }

    @Test
    public void test_one_dollar_reduce_two_franc() {
        Money oneDollar = Money.dollar(1);
        assertEquals(Money.franc(2), bank.reduce(oneDollar, Money.FRANC_CURRENCY));
    }

    @Test
    public void test_one_dollar_add_two_franc_equals_two_dollar() {
        Sum sum = new Sum(Money.dollar(1), Money.franc(2));
        assertEquals(Money.dollar(2), bank.reduce(sum, Money.DOLLAR_CURRENCY));
    }
}
