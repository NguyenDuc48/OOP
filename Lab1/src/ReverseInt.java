import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int inNumber = sc.nextInt();
        int inDigit;
        int newInt = 0;
        while (inNumber > 0) {
            inDigit = inNumber % 10;
            newInt = newInt * 10 + inDigit;
            inNumber /= 10;
        }
        System.out.println("The reverse is :" + newInt);
    }
}
