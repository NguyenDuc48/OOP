import java.util.Scanner;


public class PhoneKeyPad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String:");
        String inStr = sc.next().toLowerCase();
        convertToPhoneKeyPadA(inStr);
        System.out.println();
        convertToPhoneKeyPadB(inStr);
    }

    public static void convertToPhoneKeyPadA(String inStr) {
        int inStrLen = inStr.length();

        System.out.println("A");
        // su dung if-else
        for (int charIdx = 0; charIdx < inStrLen; ++charIdx) {
            char temp = inStr.charAt(charIdx);
            if (temp == 'a' || temp == 'b' || temp == 'c')
                System.out.print(2);
            else if (temp == 'd' || temp == 'e' || temp == 'f')
                System.out.print(3);
            else if (temp == 'g' || temp == 'h' || temp == 'i')
                System.out.print(4);
            else if (temp == 'j' || temp == 'k' || temp == 'l')
                System.out.print(5);
            else if (temp == 'm' || temp == 'n' || temp == 'o')
                System.out.print(6);
            else if (temp == 'p' || temp == 'q' || temp == 'r' || temp == 's')
                System.out.print(7);
            else if (temp == 't' || temp == 'u' || temp == 'v')
                System.out.print(8);
            else if (temp == 'w' || temp == 'x' || temp == 'y' || temp == 'z')
                System.out.print(9);
            else System.out.print(1);
        }
    }

    // su dung switch - case
    public static void convertToPhoneKeyPadB(String inStr) {
        int inStrLen = inStr.length();

        System.out.println("B");
        for (int charIdx = 0; charIdx < inStrLen; ++charIdx) {
            char temp = inStr.charAt(charIdx);
            switch (temp) {
                case 'a', 'b', 'c' -> System.out.print(2);
                case 'd', 'e', 'f' -> System.out.print(3);
                case 'g', 'h', 'i' -> System.out.print(4);
                case 'j', 'k', 'l' -> System.out.print(5);
                case 'm', 'n', 'o' -> System.out.print(6);
                case 'p', 'r', 'q', 's' -> System.out.print(7);
                case 't', 'u', 'v' -> System.out.print(8);
                case 'w', 'x', 'y', 'z' -> System.out.print(9);
                default -> System.out.print(1);
            }
        }
    }
}