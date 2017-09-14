/*import java.util.ArrayList;

public class Euler010 {
    private static ArrayList<Integer> sieve(Integer exclusiveMax) {
        ArrayList<Boolean> bools = new ArrayList<>();
        ArrayList<Integer> primes = new ArrayList<>();
        bools.add(false);
        bools.add(false);
        for (int i = 2; i < exclusiveMax; i++) {
            bools.add(true);
        }

        for (int n = 2; n < exclusiveMax; n++) {
            if (bools.get(n)) {
                for (int i = 2 * n; i < exclusiveMax; i += n) {
                    bools.set(i, false);
                }
            }
        }

        for (int num = 2; num < exclusiveMax; num++) {
            if (bools.get(num)) {
                primes.add(num);
            }
        }

        return primes;
    }

    private static Long calculate() {
        ArrayList<Integer> primes = sieve(2000000);
        Long sum = 0L;
        for (int num : primes) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(calculate());
    }
}*/
