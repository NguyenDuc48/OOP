import java.util.Scanner;

// ma hoa theo n = 3
public class CaesarCode {
    public static void main(String[] args) {
        String inStr;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        inStr = sc.next().toUpperCase();
        System.out.print("The ciphertext string is: ");
        convertCaesar(inStr);
    }

    public static void convertCaesar(String inStr) {
        // su dung if-else
        for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
            char ch = inStr.charAt(charIdx);
            if (ch >= 'A' && ch <= 'W') {
                ch = (char) (ch + 3);
                System.out.print(ch);
            } else if (ch == 'X') {
                System.out.print('A');
            } else if (ch == 'Y') {
                System.out.print('B');
            } else if (ch == 'Z') {
                System.out.print('C');
            }
        }
    }
}