import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    public void testComputeReturnOneIfTheNumberIsZero() {
        var factorial = new Factorial();
        int expectedValue = 1;
        int obtainedValue = factorial.compute(0);

        assertEquals(expectedValue, obtainedValue);
    }
}
