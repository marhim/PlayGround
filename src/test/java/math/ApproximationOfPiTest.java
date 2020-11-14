package math;

import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.math.MathContext;
import org.junit.Test;

public class ApproximationOfPiTest {

  private static final String THOUSAND_PI_DIGITS =
      "3."
          + "1415926535897932384626433832795028841971693993751" // 1 to 49
          + "05820974944592307816406286208998628034825342117067" // 50 to 99
          + "98214808651328230664709384460955058223172535940812" // 100 to 149
          + "84811174502841027019385211055596446229489549303819" // 150 to 199
          + "64428810975665933446128475648233786783165271201909" // 200 to 249
          + "14564856692346034861045432664821339360726024914127" // 250 to 299
          + "37245870066063155881748815209209628292540917153643" // 300 to 349
          + "67892590360011330530548820466521384146951941511609" // 350 to 399
          + "43305727036575959195309218611738193261179310511854" // 400 to 449
          + "80744623799627495673518857527248912279381830119491" // 450 to 499
          + "29833673362440656643086021394946395224737190702179" // 500 to 549
          + "86094370277053921717629317675238467481846766940513" // 550 to 599
          + "20005681271452635608277857713427577896091736371787" // 600 to 649
          + "21468440901224953430146549585371050792279689258923" // 650 to 699
          + "54201995611212902196086403441815981362977477130996" // 700 to 749
          + "05187072113499999983729780499510597317328160963185" // 750 to 799
          + "95024459455346908302642522308253344685035261931188" // 800 to 849
          + "17101000313783875288658753320838142061717766914730" // 850 to 899
          + "35982534904287554687311595628638823537875937519577" // 900 to 949
          + "81857780532171226806613001927876611195909216420198"; // 950 to 999
  private static final MathContext PRECISION_2048_BITS = new MathContext(2048);
  private static final BigDecimal PI = new BigDecimal(THOUSAND_PI_DIGITS, PRECISION_2048_BITS);

  @Test
  public void testCalcPiWithLeibniz() {
    System.out.println("Calculation of Pi");
    System.out.println("Expecting:\t" + PI.toEngineeringString());
    BigDecimal calculated = ApproximationOfPi.calcPiWithLeibniz();
    System.out.println("Calculated:\t" + calculated.toEngineeringString());
    BigDecimal tolerance = new BigDecimal("1E-100");
    BigDecimal delta = PI.subtract(calculated).abs();
    System.out.println("Difference: " + delta.toEngineeringString());
    assertTrue(
        "Difference should ne within " + tolerance.toEngineeringString(),
        delta.compareTo(tolerance) < 1);
  }
}
