public class ExponentialSeries {
    public static void main(String[] args) {
        System.out.println(specialSeries(0.5, 3));
    }

    public static double specialSeries(double x, int numTerms) {

        if (numTerms == 1) {
            return x;
        }
        double sum = x;
        int temp = 1;
        double fraction = x;
        for (int i = 1; i < numTerms; i++) {
            double val = (double) temp / (temp + 1);
            temp += 2;
            fraction = fraction * val * x * x;
            sum += fraction / temp;
        }
        return sum;
    }
}
