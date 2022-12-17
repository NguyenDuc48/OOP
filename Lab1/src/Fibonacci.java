public class Fibonacci {
    public static void main(String[] args) {

        int n = 3;
        int fn;
        int fnMinus1 = 1;
        int fnMinus2 = 1;
        int nMax = 20;
        int sum = fnMinus1 + fnMinus2;
        int sumFibo = sum;
        double average;
        System.out.println("The first " + nMax + " Fibonacci numbers are: ");
        System.out.print(fnMinus1 + " " + fnMinus2);
        while (n <= nMax) {
            fn = sum;
            fnMinus1 = fnMinus2;
            fnMinus2 = fn;
            sum = fnMinus1 + fnMinus2;
            sumFibo += fn;
            System.out.print(" " + fn);
            n++;
        }
        System.out.println("The average is " + sumFibo * 1.0 / nMax);
    }
}
