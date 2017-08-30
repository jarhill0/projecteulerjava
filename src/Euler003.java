import java.util.ArrayList;
import java.util.Collections;

public class Euler003 {
    public static void main(String[] args) {
        System.out.println(Collections.max(primeFactors(600851475143L)));
    }

    private static ArrayList<Integer> primeFactors(long number) {
        Integer factor = 2;
        ArrayList<Integer> factors = new ArrayList<>();
        while (factor <= number) {
            if (number % factor == 0) {
                while (number % factor == 0) {
                    number /= factor;
                }
                factors.add(factor);
            }
            factor++;
        }
        return factors;
    }
}
