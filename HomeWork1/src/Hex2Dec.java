import java.util.Scanner;


public class Hex2Dec {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal: ");
        String inStr = sc.next().toLowerCase();
        convertHexToDecimal(inStr);
    }

    public static void convertHexToDecimal(String inStr) {
        String hexCode = "0123456789abcdef";
        int num = 0;
        boolean check = true;
        for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
            int c = inStr.charAt(charIdx);
            int n = hexCode.indexOf(c);
            if (n == -1) {
                check = false;
                break;
            } else {
                num = num * 16 + n;
            }

        }
        if (check) {
            System.out.println("The equivalent decimal number for hexadecimal " + inStr + " is: " + num);
        } else {
            System.out.print("Error: invalid hexadecimal string " + inStr);
        }
    }
}