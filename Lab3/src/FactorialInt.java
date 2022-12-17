public class FactorialInt {

    public static void main(String[] args) {
        printFactorial();
    }

    public static void printFactorial() {
        int idx = 1;
        int val = 1;
        while (1 == 1) {
            if (Integer.MAX_VALUE / val < idx + 1) {
                System.out.println("The factorial of " + idx + " is out of range");
                break;
            }
            val *= idx;
            idx++;
            System.out.println("The factorial of " + idx + " is " + val);
        }
    }
}
