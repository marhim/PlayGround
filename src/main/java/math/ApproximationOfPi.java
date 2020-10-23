package math;

import java.util.function.Function;

/**
 * Approximation of Pi with the calculation of Archimedes.
 */
public class ApproximationOfPi {

    // The absolute Error of the Approximation have to be less than this double to be printed
    private static final double ACCURACY = 0.000001;

    public static void main(String[] args) {
        System.out.println("Pi = " + Math.PI);
        System.out.println("Accuracy: " + ACCURACY + " (Abs.Err. must be less than this to be printed)");
        System.out.println("\nApprox of (1):");
        printApproximation(ApproximationOfPi::approxFirst);
        System.out.println("\nApprox of (2):");
        printApproximation(ApproximationOfPi::approxSecond);
    }

    private static void printApproximation(Function<Integer, Double> function) {
        int n = 6; // Starts with Hexagon
        int nMax = 30; // Max iteration steps
        for (int i = 0; i < nMax; i++) {
            // Only positive n-gons for the approximation
            if (n > 0) {
                Double approx = function.apply(n);
                if (Math.abs(Math.PI - approx) < ACCURACY) { // absolute error must be less than given accuracy
                    System.out.println(i + ": " + n + "-Gon\tApprox.: " + approx + "\t\tAbs.Err: " + Math.abs(Math.PI - approx));
                }
                n *= 2; // Doubles the n-gon
            }
        }
    }

    private static Double approxFirst(Integer n) {
        return n * Math.sqrt((1 - Math.sqrt(1 - Math.pow(Math.sin(Math.toRadians(360d / n)), 2))) / 2);
    }

    private static Double approxSecond(Integer n) {
        double v = Math.sin(Math.toRadians(360d / n));
        return n * (v / Math.sqrt(2 * (1 + Math.sqrt(1 - Math.pow(v, 2)))));
    }
}
