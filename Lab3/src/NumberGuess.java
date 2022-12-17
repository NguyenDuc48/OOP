import java.util.Scanner;

public class NumberGuess {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int num = (int) (Math.random() * 99 + 1);
        numberGuess(num);
    }

    public static void numberGuess(int num) {
        System.out.println("Key in your guess: ");
        int numGuess = sc.nextInt();
        int count = 1;
        while (1 == 1) {
            if (numGuess == num) {
                System.out.println("You got it in " + count + " trials!");
                break;
            }
            if (numGuess > num) {
                System.out.println("Try lower");
                numGuess = sc.nextInt();
            } else {
                System.out.println("Try higher");
                numGuess = sc.nextInt();
            }
            count++;
        }
    }
}
