package math;

import java.math.BigInteger;

public class Factorial {

  private static final String NEGATIVE_ARG_EXCEPTION = "n must be greater than -1!";

  /**
   * Factorial-method using BigInteger which can hold values up to 2^Integer.MAX_VALUE. The long
   * datatype can only be used for factorials with n < 21.
   *
   * @param n Integer to which the factorial shall be calculated
   * @return Factorial of n
   */
  public static BigInteger factorial(int n) {
    if (n < 0) {
      throw new IllegalArgumentException(NEGATIVE_ARG_EXCEPTION);
    }
    BigInteger fac = BigInteger.ONE;
    for (int i = 2; i <= n; i++) {
      fac = fac.multiply(BigInteger.valueOf(i));
    }
    return fac;
  }

  /**
   * Like {@link #factorial(int)} just with recursion.
   *
   * @param n Integer to which the factorial shall be calculated
   * @return Factorial of n
   */
  public static BigInteger factorialRec(int n) {
    if (n < 0) {
      throw new IllegalArgumentException(NEGATIVE_ARG_EXCEPTION);
    }
    return n <= 1 ? BigInteger.ONE : BigInteger.valueOf(n).multiply(factorialRec(n - 1));
  }
}
