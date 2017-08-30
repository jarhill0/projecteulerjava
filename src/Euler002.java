public class Euler002 {
    private Integer a = 0;
    private Integer b = 1;


    public static void main(String[] args) {
        Euler002 problem = new Euler002();
        System.out.println(problem.calculate());
    }

    private Integer calculate() {
        Integer total = 0;
        while (this.b < 4000000) {
            if (this.b % 2 == 0) {
                total += this.b;
            }
            this.inc();
        }
        return total;
    }

    private void inc() {
        Integer temp = this.b;
        this.b += this.a;
        this.a = temp;
    }
}
