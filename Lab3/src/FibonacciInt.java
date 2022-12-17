public class FibonacciInt {

    public static void main(String[] args) {
        printFibo();
    }

    public static void printFibo() {

        int idx = 0;
        System.out.println("F(" + idx + ") = " + 1);
        idx++;
        System.out.println("F(" + idx + ") = " + 1);
        idx++;
        int f1 = 1;
        int f2 = 1;
        int fn = 0;

        while (1 == 1) {

            if (Integer.MAX_VALUE - f2 < f1) {

                System.out.println("F(" + idx + ") is out of the range of int");
                break;
            }
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
            idx++;
            System.out.println("F(" + idx + ") = " + fn);
        }

    }
}
