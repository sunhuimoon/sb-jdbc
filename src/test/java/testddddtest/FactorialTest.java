package testddddtest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import testdddd.Factorial;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    @Test
    void testNegative() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.fact(-1));
    }

}