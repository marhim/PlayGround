package math;

import org.junit.Test;

import java.math.BigInteger;
import java.util.function.BiFunction;

import static org.junit.Assert.assertEquals;

public class GreatestCommonDivisorTest {

    @Test
    public void testSimpleGCDs() {
        simpleGCDs(GreatestCommonDivisor::findGCD);
    }

    @Test
    public void testSimpleGCDsByEuclid() {
        simpleGCDs(GreatestCommonDivisor::findGCDByEuclid);
    }

    private void simpleGCDs(BiFunction<BigInteger, BigInteger, BigInteger> gcd) {
        assertEquals("gcd of 8 and 12 should be 4.", BigInteger.valueOf(4),
                gcd.apply(BigInteger.valueOf(8), BigInteger.valueOf(12)));
        assertEquals("gcd of 24 and 36 should be 12.", BigInteger.valueOf(12),
                gcd.apply(BigInteger.valueOf(24), BigInteger.valueOf(36)));
        assertEquals("gcd of 54 and 24 should be 6.", BigInteger.valueOf(6),
                gcd.apply(BigInteger.valueOf(54), BigInteger.valueOf(24)));
    }
}
