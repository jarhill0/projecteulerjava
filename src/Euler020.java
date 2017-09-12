import java.math.BigInteger;

public class Euler020 {
    private static long calculate() {
        String digits = factorial(100).toString();
        long sum = 0L;
        for (int digit : digits.toCharArray()) {
            sum += digit - 48; // My for loop uses `digit` as the ASCII value of each character. Subtract 48 for a useful value. Hacky, I know.
        }
        return sum;
    }

    private static BigInteger factorial(int num) {
        BigInteger product = BigInteger.valueOf(1);
        for (int factor = num; factor > 1; factor--) {
            product = product.multiply(BigInteger.valueOf(factor));
        }
        return product;
    }

    public static void main(String[] args) {
        System.out.println(calculate());
    }
}
