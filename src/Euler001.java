public class Euler001 {

    public static void main(String[] args) {
        int total = 0;

        for (int n = 3; n < 1000; n++) {
            if (n % 5 == 0 || n % 3 == 0) {
                total += n;
            }
        }

        System.out.println(total);
    }
}
