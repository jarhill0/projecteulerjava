import java.util.ArrayList;


public class Euler029 {
    public Euler029() {
        Sequence seq = new Sequence();

        for (double a = 2; a <= 100; a++) {
            for (double b = 2; b <= 100; b++) {
                seq.add(Math.pow(a, b));
            }
        }

        System.out.println(seq.getSize());
    }

    public static void main(String[] args) {
        new Euler029();
    }
}

class Sequence {
    private ArrayList<Double> values = new ArrayList<Double>();

    public void add(double num) {
        if (!values.contains(num)) {
            values.add(num);
        }
    }

    public int getSize() {
        return values.size();
    }
}