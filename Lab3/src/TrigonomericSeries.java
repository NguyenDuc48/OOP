public class TrigonomericSeries {

    public static void main(String[] args) {

        System.out.println(Math.sin(Math.PI / 6));
        System.out.println(sin(Math.PI / 6, 10));
    }

    public static double sin(double x, int numTerms) {
        double sum = 0;
        int check = 0;
        int temp = 1;
        for (int i = 0; i < numTerms; i++) {
            double val = x / temp;
            for (int j = temp - 1; j >= 1; j--) {
                double fraction = x / j;
                val *= fraction;
            }
            if (check % 2 == 0) {
                sum += val;
            } else {
                sum -= val;
            }
            check++;
            temp += 2;

        }
        return sum;
    }

    public static double cos(double x, int numTerms) {
        double sum = 1;
        int check = 1;
        int temp = 2;
        for (int i = 0; i < numTerms; i++) {
            double val = x / temp;
            for (int j = temp - 1; j >= 1; j--) {
                double phanso = x / j;
                val *= phanso;
            }
            if (check % 2 == 0) {
                sum += val;
            } else {
                sum -= val;
            }
            check++;
            temp += 2;

        }
        return sum;
    }
}