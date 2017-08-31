public class Euler009 {
    private static Integer calculate() {
        Double c;
        for (int a = 1; a < 1000; a++) {
            for (int b = 1; b < 1000; b++) {
                c = Math.sqrt(a * a + b * b);
                if (c % 1 == 0 && a + b + c == 1000) {
                    return a * b * c.intValue();
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(calculate());
    }
}
