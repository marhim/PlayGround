package math;

import java.math.BigInteger;

public class Factorial {

    /**
     * Factorial-method using BigInteger which can hold values up to 2^Integer.MAX_VALUE. The long datatype can only
     * be used for factorials with n < 21.
     *
     * @param n Integer to which the factorial shall be calculated
     * @return Factorial of n
     */
    public static BigInteger factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be greater than -1!");
        }
        BigInteger fac = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            fac = fac.multiply(BigInteger.valueOf(i));
        }
        return fac;
    }
}
