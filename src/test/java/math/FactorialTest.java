package math;

import org.junit.Test;

import java.math.BigInteger;
import java.util.function.Function;

import static org.junit.Assert.assertEquals;

public class FactorialTest {

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeValues() {
        negativeValues(Factorial::factorial);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeValuesRec() {
        negativeValues(Factorial::factorialRec);
    }

    private void negativeValues(Function<Integer, BigInteger> factorial) {
        factorial.apply(-1);
    }

    @Test
    public void testSimpleFactorials() {
        simpleFactorials(Factorial::factorial);
    }

    @Test
    public void testSimpleFactorialsRec() {
        simpleFactorials(Factorial::factorialRec);
    }

    private void simpleFactorials(Function<Integer, BigInteger> factorial) {
        assertEquals("0! should be 1.", BigInteger.ONE, factorial.apply(0));
        assertEquals("1! should be 1.", BigInteger.ONE, factorial.apply(1));
        assertEquals("2! should be 2.", BigInteger.valueOf(2), factorial.apply(2));
        assertEquals("3! should be 6.", BigInteger.valueOf(6), factorial.apply(3));
        assertEquals("4! should be 24.", BigInteger.valueOf(24), factorial.apply(4));
        assertEquals("5! should be 120.", BigInteger.valueOf(120), factorial.apply(5));
    }

    @Test
    public void testBigFactorials() {
        bigFactorials(Factorial::factorial);
    }

    @Test
    public void testBigFactorialsRec() {
        bigFactorials(Factorial::factorialRec);
    }

    private void bigFactorials(Function<Integer, BigInteger> factorial) {
        int n = 30;
        String factorialNumber = "265252859812191058636308480000000";
        assertEquals(n + "! should be " + factorialNumber + ".",
                new BigInteger(factorialNumber), factorial.apply(n));
        n = 40;
        factorialNumber = "815915283247897734345611269596115894272000000000";
        assertEquals(n + "! should be " + factorialNumber + ".",
                new BigInteger(factorialNumber), factorial.apply(n));
        n = 50;
        factorialNumber = "30414093201713378043612608166064768844377641568960512000000000000";
        assertEquals(n + "! should be " + factorialNumber + ".",
                new BigInteger(factorialNumber), factorial.apply(n));
        n = 60;
        factorialNumber = "8320987112741390144276341183223364380754172606361245952449277696409600000000000000";
        assertEquals(n + "! should be " + factorialNumber + ".",
                new BigInteger(factorialNumber), factorial.apply(n));
    }
}
