import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FrancTest {
    @Test
    public void test_one_franc_should_equal_one_franc() {
        assertEquals(new Franc(1), new Franc(1));
    }

    @Test
    public void test_two_franc_should_not_equal_one_franc() {
        assertNotEquals(new Franc(2), new Franc(1));
    }

    @Test
    public void test_one_franc_add_one_franc_should_equal_two_franc() {
        Franc one = new Franc(1);
        Franc anotherOne = new Franc(1);
        assertEquals(one.plus(anotherOne), new Franc(2));
    }

    @Test
    public void test_one_franc_add_two_franc_should_equal_three_franc() {
        Franc one = new Franc(1);
        Franc two = new Franc(2);
        assertEquals(one.plus(two), new Franc(3));
    }

    @Test
    public void test_one_franc_multiply_two_should_equal_two_franc() {
        Franc one = new Franc(1);
        assertEquals(one.multiply(2), new Franc(2));
    }

    @Test
    public void test_two_franc_multiply_two_should_equal_four_franc() {
        Franc two = new Franc(2);
        assertEquals(two.multiply(2), new Franc(4));
    }
}
