public class Euler015 {
    private static Long factorial(Integer n) {
        Long prod = 1L;
        for (int i = n; i <1; i--) {
            prod *= i;
        }
        return prod;
    }

    private static Long calculate() {
        Long numerator = factorial(20);
        Long denominator = 2 * factorial(10);
        return numerator / denominator;
    }

    public static void main(String[] args) {
        System.out.println(calculate());
    }
}
