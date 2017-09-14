public class Euler021 {
    private static int limit = 10000;

    private static int sumDivisors(int num) {
        int total = 0;
        for (int f=1; f<num; f++) {
            // Naive approach; we really only have to go up to the square root
            if (num%f==0) {
                total+=f;
            }
        }
        return total;
    }

    private static int calculate() {
        int total=0;
        for (int n=1; n<limit;n++) {
            int thisSum = sumDivisors(n);
            int thisSumSum = sumDivisors(thisSum);
            if (thisSumSum == n && thisSum != n) {
                total += n;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(calculate());
    }

}
