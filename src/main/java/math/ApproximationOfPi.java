package math;

import ch.obermuhlner.math.big.BigDecimalMath;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class ApproximationOfPi {

  private static final MathContext PRECISION_2048_BITS = new MathContext(2048);

  /**
   * Calculating Pi with the Leibniz formula which states: 1 - (1/3) + (1/5) - (1/7) + (1/9) - ... =
   * Pi / 4
   *
   * <p>This method is very inefficient and takes a lot of computing time for a rather bad result.
   *
   * @return Calculated Pi
   */
  public static BigDecimal calcPiByLeibniz() {
    // Number of steps for the formula and therefore the precision
    final BigDecimal n = BigDecimal.valueOf(10000000);

    BigDecimal pi = BigDecimal.ZERO;
    BigDecimal s = BigDecimal.ONE;
    BigDecimal two = BigDecimal.ONE.add(BigDecimal.ONE);
    BigDecimal negOne = BigDecimal.ONE.subtract(two);
    for (BigDecimal i = BigDecimal.ONE; i.compareTo(n) < 0; i = i.add(two)) {
      pi = pi.add(s.divide(i, 1000, RoundingMode.CEILING));
      s = s.multiply(negOne);
    }
    return pi.multiply(BigDecimal.valueOf(4));
  }

  /**
   * Calculating Pi with the method Archimedes developed by calculating the circumference of a n-Gon
   * starting with a Hexagon which has a circumference of 3 given a radius of 1. He doubled the
   * sides of a Hexagon and got a 12-gon. He proceeded to calculate Pi with this method up to a
   * 96-gon by hand. He calculated that 223/71 < Pi < 22/7 or 3.1408 < Pi < 3.1429. This method
   * calculates Pi by taking Archimedes method further to a high number of n-gons.
   *
   * @return Calculated Pi
   */
  public static BigDecimal calcPiByArchimedes() {
    long n = 6; // Starting with a hexagon
    int maxSteps = 62; // steps for doubling n
    for (int i = 0; i < maxSteps; i++) {
      n *= 2;
    }
    return archimedesCalculation(n);
  }

  private static BigDecimal archimedesCalculation(Long n) {
    BigDecimal v =
        BigDecimalMath.sin(BigDecimal.valueOf(Math.toRadians(360d / n)), PRECISION_2048_BITS);
    BigDecimal nDec = BigDecimal.valueOf(n);
    BigDecimal two = BigDecimal.ONE.add(BigDecimal.ONE);
    return nDec.multiply(
        v.divide(
            BigDecimalMath.sqrt(
                two.multiply(
                    BigDecimal.ONE.add(
                        BigDecimalMath.sqrt(
                            BigDecimal.ONE.subtract(BigDecimalMath.pow(v, 2, PRECISION_2048_BITS)),
                            PRECISION_2048_BITS))),
                PRECISION_2048_BITS),
            RoundingMode.CEILING));
  }
}
