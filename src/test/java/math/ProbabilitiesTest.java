package math;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import org.junit.Test;

public class ProbabilitiesTest {
  public static final String HALF_PERCENT = "0.005";
  public static final String ONE_PERCENT = "0.01";
  public static final String ONE_SIXTH = "0.1666666666666666666666666";
  public static final String NINETY_PERCENT = "0.9";
  public static final String NINETY_FIVE_PERCENT = "0.95";
  public static final String NINETY_NINE_PERCENT = "0.99";

  @Test(expected = IllegalArgumentException.class)
  public void testArgumentsAreNullForAtLeastOneProbability() {
    Probabilities.calcAtLeastOneProbability(null, null);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testArgumentsLowerThanZeroForAtLeastOneProbability() {
    BigDecimal p = BigDecimal.valueOf(-1);
    Probabilities.calcAtLeastOneProbability(p, p);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testArgumentsGreaterThanOneForAtLeastOneProbability() {
    Probabilities.calcAtLeastOneProbability(BigDecimal.TEN, BigDecimal.TEN);
  }

  @Test
  public void testSomeValuesForAtLeastOneProbability() {
    atLeastOneProbability(12.629253133, ONE_SIXTH, NINETY_PERCENT);
    atLeastOneProbability(16.431037153, ONE_SIXTH, NINETY_FIVE_PERCENT);
    atLeastOneProbability(25.258506273, ONE_SIXTH, NINETY_NINE_PERCENT);
    atLeastOneProbability(229.10528827, ONE_PERCENT, NINETY_PERCENT);
    atLeastOneProbability(298.07285221, ONE_PERCENT, NINETY_FIVE_PERCENT);
    atLeastOneProbability(458.210576553, ONE_PERCENT, NINETY_NINE_PERCENT);
    atLeastOneProbability(459.364764235, HALF_PERCENT, NINETY_PERCENT);
    atLeastOneProbability(597.647337221, HALF_PERCENT, NINETY_FIVE_PERCENT);
    atLeastOneProbability(918.729528471, HALF_PERCENT, NINETY_NINE_PERCENT);
  }

  public void atLeastOneProbability(double expected, String p, String a) {
    assertEquals(expected, Probabilities.calcAtLeastOneProbability(
        new BigDecimal(p), new BigDecimal(a)).doubleValue(), 0.01);
  }
}
