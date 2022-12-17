import java.util.Scanner;

public class DecipherCaesarCode {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a ciphertext string: ");
        String inStr = sc.next().toUpperCase();
        System.out.print("The plaintext string is: ");
        convertCaesar(inStr);
    }

    public static void convertCaesar(String inStr) {
        for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
            char c = inStr.charAt(charIdx);
            if (c >= 'D' && c <= 'Z') {
                c = (char) (c - 3);
                System.out.print(c);
            } else if (c == 'A') {
                System.out.print('X');
            } else if (c == 'B') {
                System.out.print('Y');
            } else if (c == 'C') {
                System.out.print('Z');
            }
        }
    }
}