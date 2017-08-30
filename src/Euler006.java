public class Euler006 {
    private static Integer sumOfSquares(Integer upperLimit) {
        Integer total = 0;
        for (int num = 1; num <= upperLimit; num++) {
            total += new Double(Math.pow(num, 2)).intValue();
        }
        return total;
    }

    private static Integer squareOfSum(Integer upperLimit) {
        Integer total = (upperLimit + 1) * (upperLimit / 2);
        return new Double(Math.pow(total, 2)).intValue();

    }

    private static Integer calculate() {
        return squareOfSum(100) - sumOfSquares(100);
    }

    public static void main(String[] args) {
        System.out.println(calculate());
    }
}
