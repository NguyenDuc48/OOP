public class ComputePI {
    public static void main(String[] args) {
        int MAXDENOMINATOR = 1000;
        double sum = 0.0;
        for (int i = 1; i <= MAXDENOMINATOR; i += 2) {
            if (i % 4 == 1) {
                sum += 1.0 / i;
            } else {
                sum -= 1.0 / i;
            }
        }
        System.out.println(Math.abs(Math.PI - 4 * sum));
    }
}
