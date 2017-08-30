public class Euler004 {
    public static void main(String[] args) {
        System.out.println(calculate());
    }

    private static Integer calculate() {
        Integer largestPalindrome = 0;
        Integer product;
        for (int a = 100; a < 1000; a++) {
            for (int b = 100; b < 1000; b++) {
                // Generates all products of two three-digit numbers
                product = a * b;
                if (isPalindrome(product) && product > largestPalindrome) {
                    largestPalindrome = product;
                }
            }
        }
        return largestPalindrome;
    }

    private static boolean isPalindrome(Integer num) {
        String numString = num.toString();
        String reversedNumString = new StringBuilder(numString).reverse().toString();
        Integer reversedNum = Integer.parseInt(reversedNumString);

        return (reversedNum.equals(num));
    }
}
