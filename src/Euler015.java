import java.math.BigInteger;

public class Euler015 {
    private static BigInteger factorial(Integer n) {
        BigInteger prod = BigInteger.valueOf(1);
        for (int i = n; i > 1; i--) {
            prod = prod.multiply(BigInteger.valueOf(i));
        }
        return prod;
    }

    private static Long calculate() {
        // Very memory inefficient. It would make a lot more sense to multiply in and divide out so that we can use longs only.
        BigInteger numerator = factorial(40);
        BigInteger denominator_sqrt = factorial(20);
        BigInteger denominator = denominator_sqrt.multiply(denominator_sqrt);
        return numerator.divide(denominator).longValue();
    }

    public static void main(String[] args) {
        System.out.println(calculate());
    }
}
