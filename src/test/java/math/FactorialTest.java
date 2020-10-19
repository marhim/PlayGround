package math;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class FactorialTest {

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeValues() {
        Factorial.factorial(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeValuesRec() {
        Factorial.factorialRec(-1);
    }

    @Test
    public void testSimpleFactorials() {
        assertEquals("0! should be 1.", BigInteger.ONE, Factorial.factorial(0));
        assertEquals("1! should be 1.", BigInteger.ONE, Factorial.factorial(1));
        assertEquals("2! should be 2.", BigInteger.valueOf(2), Factorial.factorial(2));
        assertEquals("3! should be 6.", BigInteger.valueOf(6), Factorial.factorial(3));
        assertEquals("4! should be 24.", BigInteger.valueOf(24), Factorial.factorial(4));
        assertEquals("5! should be 120.", BigInteger.valueOf(120), Factorial.factorial(5));
    }

    @Test
    public void testSimpleFactorialsRec() {
        assertEquals("0! should be 1.", BigInteger.ONE, Factorial.factorialRec(0));
        assertEquals("1! should be 1.", BigInteger.ONE, Factorial.factorialRec(1));
        assertEquals("2! should be 2.", BigInteger.valueOf(2), Factorial.factorialRec(2));
        assertEquals("3! should be 6.", BigInteger.valueOf(6), Factorial.factorialRec(3));
        assertEquals("4! should be 24.", BigInteger.valueOf(24), Factorial.factorialRec(4));
        assertEquals("5! should be 120.", BigInteger.valueOf(120), Factorial.factorialRec(5));
    }

    @Test
    public void testBigFactorials() {
        int n = 30;
        String factorialNumber = "265252859812191058636308480000000";
        assertEquals(n + "! should be " + factorialNumber + ".",
                new BigInteger(factorialNumber), Factorial.factorial(n));
        n = 40;
        factorialNumber = "815915283247897734345611269596115894272000000000";
        assertEquals(n + "! should be " + factorialNumber + ".",
                new BigInteger(factorialNumber), Factorial.factorial(n));
        n = 50;
        factorialNumber = "30414093201713378043612608166064768844377641568960512000000000000";
        assertEquals(n + "! should be " + factorialNumber + ".",
                new BigInteger(factorialNumber), Factorial.factorial(n));
        n = 60;
        factorialNumber = "8320987112741390144276341183223364380754172606361245952449277696409600000000000000";
        assertEquals(n + "! should be " + factorialNumber + ".",
                new BigInteger(factorialNumber), Factorial.factorial(n));
    }

    @Test
    public void testBigFactorialsRec() {
        int n = 30;
        String factorialNumber = "265252859812191058636308480000000";
        assertEquals(n + "! should be " + factorialNumber + ".",
                new BigInteger(factorialNumber), Factorial.factorialRec(n));
        n = 40;
        factorialNumber = "815915283247897734345611269596115894272000000000";
        assertEquals(n + "! should be " + factorialNumber + ".",
                new BigInteger(factorialNumber), Factorial.factorialRec(n));
        n = 50;
        factorialNumber = "30414093201713378043612608166064768844377641568960512000000000000";
        assertEquals(n + "! should be " + factorialNumber + ".",
                new BigInteger(factorialNumber), Factorial.factorialRec(n));
        n = 60;
        factorialNumber = "8320987112741390144276341183223364380754172606361245952449277696409600000000000000";
        assertEquals(n + "! should be " + factorialNumber + ".",
                new BigInteger(factorialNumber), Factorial.factorialRec(n));
    }
}
