package math;

import static org.junit.Assert.assertEquals;

import java.math.BigInteger;
import java.util.function.Function;
import org.junit.Test;

public class FactorialTest {

  @Test(expected = IllegalArgumentException.class)
  public void testNegativeValues() {
    negativeValues(Factorial::factorial);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testNegativeValuesRec() {
    negativeValues(Factorial::factorialRec);
  }

  private void negativeValues(Function<Integer, BigInteger> factorial) {
    factorial.apply(-1);
  }

  @Test
  public void testSimpleFactorials() {
    simpleFactorials(Factorial::factorial);
  }

  @Test
  public void testSimpleFactorialsRec() {
    simpleFactorials(Factorial::factorialRec);
  }

  private void simpleFactorials(Function<Integer, BigInteger> factorial) {
    assertEquals("0! should be 1.", BigInteger.ONE, factorial.apply(0));
    assertEquals("1! should be 1.", BigInteger.ONE, factorial.apply(1));
    assertEquals("2! should be 2.", BigInteger.valueOf(2), factorial.apply(2));
    assertEquals("3! should be 6.", BigInteger.valueOf(6), factorial.apply(3));
    assertEquals("4! should be 24.", BigInteger.valueOf(24), factorial.apply(4));
    assertEquals("5! should be 120.", BigInteger.valueOf(120), factorial.apply(5));
    assertEquals("6! should be 720.", BigInteger.valueOf(720), factorial.apply(6));
    assertEquals("7! should be 5,040.", BigInteger.valueOf(5040), factorial.apply(7));
    assertEquals("8! should be 40,320.", BigInteger.valueOf(40320), factorial.apply(8));
    assertEquals("9! should be 362,880.", BigInteger.valueOf(362880), factorial.apply(9));
  }

  @Test
  public void testBigFactorials() {
    bigFactorials(Factorial::factorial);
  }

  @Test
  public void testBigFactorialsRec() {
    bigFactorials(Factorial::factorialRec);
  }

  private void bigFactorials(Function<Integer, BigInteger> factorial) {
    int n = 10;
    String factorialNumber = "3628800";
    assertEquals(
        n + "! should be " + factorialNumber + ".",
        new BigInteger(factorialNumber),
        factorial.apply(n));
    n = 20;
    factorialNumber = "2432902008176640000";
    assertEquals(
        n + "! should be " + factorialNumber + ".",
        new BigInteger(factorialNumber),
        factorial.apply(n));
    n = 30;
    factorialNumber = "265252859812191058636308480000000";
    assertEquals(
        n + "! should be " + factorialNumber + ".",
        new BigInteger(factorialNumber),
        factorial.apply(n));
    n = 40;
    factorialNumber = "815915283247897734345611269596115894272000000000";
    assertEquals(
        n + "! should be " + factorialNumber + ".",
        new BigInteger(factorialNumber),
        factorial.apply(n));
    n = 50;
    factorialNumber = "30414093201713378043612608166064768844377641568960512000000000000";
    assertEquals(
        n + "! should be " + factorialNumber + ".",
        new BigInteger(factorialNumber),
        factorial.apply(n));
    n = 60;
    factorialNumber =
        "8320987112741390144276341183223364380754172606361245952449277696409600000000000000";
    assertEquals(
        n + "! should be " + factorialNumber + ".",
        new BigInteger(factorialNumber),
        factorial.apply(n));
    n = 70;
    factorialNumber =
        "11978571669969891796072783721689098736458938142546425857555362864628009582789845319680000000000000000";
    assertEquals(
        n + "! should be " + factorialNumber + ".",
        new BigInteger(factorialNumber),
        factorial.apply(n));
    n = 80;
    factorialNumber =
        "71569457046263802294811533723186532165584657342365752577109445058227039255480148842668944867280814080000000000000000000";
    assertEquals(
        n + "! should be " + factorialNumber + ".",
        new BigInteger(factorialNumber),
        factorial.apply(n));
    n = 90;
    factorialNumber =
        "1485715964481761497309522733620825737885569961284688766942216863704985393094065876545992131370884059645617234469978112000000000000000000000";
    assertEquals(
        n + "! should be " + factorialNumber + ".",
        new BigInteger(factorialNumber),
        factorial.apply(n));
    n = 100;
    factorialNumber =
        "93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000";
    assertEquals(
        n + "! should be " + factorialNumber + ".",
        new BigInteger(factorialNumber),
        factorial.apply(n));
  }
}
