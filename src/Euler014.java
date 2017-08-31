import java.util.HashMap;

public class Euler014 {
    private HashMap<Long, Integer> solvedCollatz = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(new Euler014().calculate());
    }

    private Integer collatzLength(Long start) {
        Integer len = 1;
        Long num = start;

        while (num != 1) {
            if (solvedCollatz.containsKey(num)) {
                Integer ans = len + solvedCollatz.get(num) - 1;
                solvedCollatz.put(start, ans);
                return ans;
            }

            if (num % 2 == 0) {
                num /= 2;
            } else {
                num *= 3;
                num++;
            }
            len++;
        }

        solvedCollatz.put(start, len);
        return len;
    }

    public Integer calculate() {
        Integer bestLen = 0;
        Integer bestLenStartingValue = 0;
        Integer thisLen;
        for (Integer n = 1; n < 1000000; n++) {
            thisLen = collatzLength(n.longValue());
            bestLen = thisLen > bestLen ? thisLen : bestLen;
            bestLenStartingValue = thisLen.equals(bestLen) ? n : bestLenStartingValue;
        }
        return bestLenStartingValue;
    }
}
