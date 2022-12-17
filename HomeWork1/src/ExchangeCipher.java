import java.util.Scanner;

public class ExchangeCipher {
    public static void main(String[] args) {

        int inStrLen;
        Scanner sc = new Scanner(System.in);
        StringBuilder outStr = new StringBuilder();
        System.out.print("Enter a plaintext string: ");
        String inStr = sc.next().toUpperCase();
        inStrLen = inStr.length();

        for (int charIdx = 0; charIdx < inStrLen; ++charIdx) {
            char temp = (char) ('A' + 'Z' - inStr.charAt(charIdx)); // ep kieu
            outStr.append(temp);
        }
        System.out.println("The plain text String is: " + outStr);
    }

}