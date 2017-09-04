import java.math.BigInteger;

public class Euler016 {
    public static Integer calculate() {
        String digits = BigInteger.valueOf(2).pow(1000).toString();
        Integer total = 0;
        for (Character chr : digits.toCharArray()) {
            total += Integer.parseInt(chr.toString());
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(calculate());
    }
}
