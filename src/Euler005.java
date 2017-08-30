public class Euler005 {

    private static Integer calculate() {
        //Brute force :'(
        for (int num = 2520; true; num++) {
            if (divisibleByRange(num, 20)) {
                return num;
            }
        }

    }

    private static boolean divisibleByRange(Integer value, Integer upperLimit) {
        for (int i = 2; i <= upperLimit; i++) {
            if (value % i != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(calculate());
    }
}
