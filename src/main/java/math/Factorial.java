package math;

import java.math.BigInteger;
import java.util.stream.Stream;

public class Factorial {

  /**
   * Factorial-method using BigInteger which can hold values up to 2^Integer.MAX_VALUE. The long
   * datatype can only be used for factorials with n < 21.
   *
   * @param n Integer to which the factorial shall be calculated
   * @return Factorial of n
   */
  public static BigInteger factorial(int n) {
    checkArgumentValidity(n);
    BigInteger fac = BigInteger.ONE;
    for (int i = 2; i <= n; i++) {
      fac = fac.multiply(BigInteger.valueOf(i));
    }
    return fac;
  }

  /**
   * Like {@link #factorial(int)} just with Java 8 Streams.
   *
   * @param n Integer to which the factorial shall be calculated
   * @return Factorial of n
   */
  public static BigInteger factorialStream(int n) {
    checkArgumentValidity(n);
    return Stream.iterate(BigInteger.ONE, i -> i.add(BigInteger.ONE))
        .limit(n)
        .reduce(BigInteger.ONE, BigInteger::multiply);
  }

  /**
   * Like {@link #factorial(int)} just with recursion.
   *
   * @param n Integer to which the factorial shall be calculated
   * @return Factorial of n
   */
  public static BigInteger factorialRec(int n) {
    checkArgumentValidity(n);
    return n <= 1 ? BigInteger.ONE : BigInteger.valueOf(n).multiply(factorialRec(n - 1));
  }

  /**
   * Checks the validity for factorial Arguments e.g. that they must not be smaller than zero.
   *
   * @param n Argument to be checked
   */
  private static void checkArgumentValidity(int n) {
    if (n < 0) {
      throw new IllegalArgumentException("n must be greater than -1!");
    }
  }
}
