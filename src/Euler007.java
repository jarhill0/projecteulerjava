public class Euler007 {
    private static Integer nextPrime(Integer prime) {
        while (true) {
            prime++;
            if (isPrime(prime)) {
                return prime;
            }

        }
    }

    private static boolean isPrime(Integer num) {
        if (num % 2 == 0) {
            return false;
        }
        int upperlimit = new Double(Math.sqrt(num)).intValue();

        for (int i = 3; i <= upperlimit; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static Integer calculate() {
        Integer prime = 2;
        Integer count = 1;
        while (count < 10001) {
            prime = nextPrime(prime);
            count++;
        }
        return prime;
    }

    public static void main(String[] args) {
        System.out.println(calculate());
    }

}
