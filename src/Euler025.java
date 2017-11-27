import java.math.BigInteger;

public class Euler025 {
    Fibbonacci fib = new Fibbonacci();

    public Euler025() {
        while (fib.next().toString().length() < 1000) {
        }
        System.out.println(fib.getSteps());
    }

    public static void main(String[] args) {
        new Euler025();
    }
}

class Fibbonacci {
    private BigInteger a = BigInteger.ZERO;
    private BigInteger b = BigInteger.ONE;
    private int steps = 1;

    public BigInteger next() {
        steps++;

        BigInteger temp = a.add(b);
        a = b;
        b = temp;
        return b;
    }

    public int getSteps() {
        return steps;
    }

}