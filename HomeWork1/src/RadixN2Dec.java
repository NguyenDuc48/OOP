import java.util.Scanner;

public class RadixN2Dec {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String inStr = sc.next().toLowerCase();
        sc.nextLine();
        sc.close();
        convertBinToDecimal(inStr);
        convertHexToDecimal(inStr);
        convertOcToDecimal(inStr);
    }

    public static void convertBinToDecimal(String inStr) {
        int result = 0;
        boolean check = true;
        for (int charIdx = inStr.length() - 1; charIdx >= 0; charIdx--) {
            char inChar = inStr.charAt(charIdx);
            if (inChar == '1') {
                result = result + (int) Math.pow(2, inStr.length() - charIdx - 1);
            } else if (inChar == '0') {
                result += 0;
            } else {
                check = false;
                break;
            }
        }

        if (check) {
            System.out.println("The equivalent decimal number for binary " + inStr + " is " + result);
        } else {
            System.out.println("Error: invalid binary string " + inStr);
        }
    }

    public static void convertHexToDecimal(String inStr) {
        String hexCode = "0123456789abcdef";
        int num = 0;
        boolean check = true;
        for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
            int ch = inStr.charAt(charIdx);
            int n = hexCode.indexOf(ch);
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
            System.out.println("Error: invalid hexadecimal string " + inStr);
        }
    }

    public static void convertOcToDecimal(String inStr) {
        int num = 0;

        for (int charIdx = 0; charIdx <= inStr.length() - 1; charIdx++) {
            char ch = inStr.charAt(charIdx);
            num = num * 8 + Character.getNumericValue(ch);
        }
        System.out.println("The equivalent decimal number for Octal " + inStr + " is " + num);
    }

}