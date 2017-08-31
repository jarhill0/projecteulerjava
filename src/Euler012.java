public class Euler012 {
    private static Integer countDivisors(Integer number) {
        Integer med = new Double(Math.sqrt(number)).intValue();
        Integer factors = 2;
        for (int f = 2; f <= med; f++) {
            if (number % f == 0) {
                factors += 2;

            }
        }
        if (new Double(number) / med == med) {
            // If the last potential factor is the square root, that is
            factors--;
        }
        return factors;
    }

    private static Integer calculate() {
        Integer triangle = 1;
        Integer step = 2;

        while (true) {
            if (countDivisors(triangle) >= 500) {
                return triangle;
            }
            triangle += step;
            step++;
        }
    }

    public static void main(String[] args) {
        System.out.println(calculate());
    }
}
