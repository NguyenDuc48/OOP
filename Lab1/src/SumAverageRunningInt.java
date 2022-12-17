public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0;
        double average;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
        int count = 0;
        for (int i = LOWERBOUND; i <= UPPERBOUND; i++) {
            sum += i;
            count++;

        }
        average = sum * 1.0 / count;
        System.out.println("The sum of " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
        System.out.println("The average is " + average);
    }
}
