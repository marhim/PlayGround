package math;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ApproximationOfPi {

  /**
   * Calculating Pi with the Leibniz formula which states: 1 - (1/3) + (1/5) - (1/7) + (1/9) - ... =
   * Pi / 4.
   *
   * @return Calculated Pi
   */
  public static BigDecimal calcPi() {
    // Number of steps for the formula and therefore the precision
    final BigDecimal n = new BigDecimal("10000000");

    BigDecimal pi = BigDecimal.ZERO;
    BigDecimal s = BigDecimal.ONE;
    BigDecimal two = BigDecimal.ONE.add(BigDecimal.ONE);
    BigDecimal negOne = BigDecimal.ONE.subtract(two);
    for (BigDecimal i = BigDecimal.ONE; i.compareTo(n) < 0; i = i.add(two)) {
      pi = pi.add(s.divide(i, 1000, RoundingMode.CEILING));
      s = s.multiply(negOne);
    }
    return pi.multiply(new BigDecimal("4"));
  }
}
