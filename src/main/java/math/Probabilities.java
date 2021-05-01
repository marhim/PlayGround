package math;

import ch.obermuhlner.math.big.BigDecimalMath;
import java.math.BigDecimal;
import java.math.MathContext;

public class Probabilities {
  private static final MathContext PRECISION_2048_BITS = new MathContext(2048);

  /**
   * Calculates number of tries which is needed for a given probability for success and a
   * minimum probability which should be reached.
   *
   * @param p Probability for success
   * @param a minimum likelihood which should be reached
   * @return Number of tries
   */
  public static BigDecimal calcAtLeastOneProbability(BigDecimal p, BigDecimal a) {
    checkIsBetweenZeroAndOne(p);
    checkIsBetweenZeroAndOne(a);
    return BigDecimalMath.log(BigDecimal.ONE.subtract(a), PRECISION_2048_BITS)
        .divide(BigDecimalMath.log(BigDecimal.ONE.subtract(p), PRECISION_2048_BITS), PRECISION_2048_BITS);
  }

  private static void checkIsBetweenZeroAndOne(BigDecimal p) {
    if (p == null)
      throw new IllegalArgumentException("Argument must not be null!");
    if (p.compareTo(BigDecimal.ZERO) < 0)
      throw new IllegalArgumentException("Argument must be greater than zero");
    if (p.compareTo(BigDecimal.ONE) > 0)
      throw new IllegalArgumentException("Argument must be low than one");
  }

}
