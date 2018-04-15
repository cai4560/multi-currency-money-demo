import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
    private HelloWorld helloWorld = new HelloWorld();

    @Test
    public void test() {
        assertEquals("hello", helloWorld.hello());
    }
}
