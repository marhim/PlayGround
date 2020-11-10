package math;

import java.math.BigInteger;

/**
 * Class for finding the greatest common divisor manually without using BigInteger.gcd().
 */
public class GreatestCommonDivisor {

    /**
     * Finding the greatest common divisor using brute force by iterating from 1 to the lowest positive number of
     * x or y.
     *
     * @param x First number
     * @param y Second number
     * @return Greatest common divisor of x and y
     */
    public static BigInteger findGCD(BigInteger x, BigInteger y) {
        if (x.compareTo(BigInteger.ZERO) < 0) {
            x = x.abs();
        }
        if (y.compareTo(BigInteger.ZERO) < 0) {
            y = y.abs();
        }
        BigInteger gcd = BigInteger.ONE;
        for (BigInteger i = BigInteger.ONE; i.compareTo(x) < 1 && i.compareTo(y) < 1; i = i.add(BigInteger.ONE)) {
            if (x.mod(i).compareTo(BigInteger.ZERO) == 0 && y.mod(i).compareTo(BigInteger.ZERO) == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
