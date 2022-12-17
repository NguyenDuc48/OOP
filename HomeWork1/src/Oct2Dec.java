import java.util.Scanner;

public class Oct2Dec {

    public static void main(String[] args) {


        int num = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Octal string: ");
        String inStr = sc.next();

        for (int charIdx = 0; charIdx <= inStr.length() - 1; charIdx++) {
            char c = inStr.charAt(charIdx);
            num = num * 8 + Character.getNumericValue(c);
        }
        System.out.print("The equivalent decimal number " + inStr + " is " + num);
    }

}