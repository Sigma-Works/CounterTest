import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;


public class CounterTest {

    Counter counter = new Counter();
    // Setting up a counter object before each test.
    @BeforeEach
    public void setUp() throws Exception {
        this.counter = new Counter();

    }

    // Testing the increment function. It is initialized to zero, so incrementing it once
    // will push it to one, incrementing it twice will push it to two.
    @Test
    public void testIncrement() {
        assertTrue(this.counter.increment() == 1);
        assertTrue(this.counter.increment() == 2);
    }

    // Testing the decrement function. Same deal here, it's initialized to zero at the start.
    // So decrementing it once will push it to -1, decrementing it twice will push it to -2.
    @Test
    public void testDecrement() {
        assertTrue(this.counter.decrement() == -1);
        assertTrue(this.counter.decrement() == -2);
    }
}
