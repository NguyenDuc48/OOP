import java.util.Scanner;

public class CheckHexStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a hex string: ");
        String inStr = sc.next();
        sc.close();
        if (checkHex(inStr)) {
            System.out.printf("\"%s\" is a hex String", inStr);
        } else {
            System.out.printf("\"%s\" is NOT a hex String", inStr);
        }
    }

    public static boolean checkHex(String inStr) {
        inStr = inStr.toUpperCase();
        for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
            char inChar = inStr.charAt(charIdx);
            if (!((inChar >= '0' && inChar <= '9') || (inChar >= 'A' && inChar <= 'F'))) {
                return false;
            }
        }
        return true;
    }
}