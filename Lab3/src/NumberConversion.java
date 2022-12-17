import java.util.Scanner;

public class NumberConversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number and radix: ");
        String in = sc.next();
        System.out.print("Enter the input radix: ");
        int inRadix = Integer.parseInt(sc.next());
        System.out.print("Enter the output radix: ");
        int outRadix = Integer.parseInt(sc.next());
        sc.close();
        System.out.println('"' + in + '"' + " in radix " + inRadix + " is " + '"' + toRadix(in, inRadix, outRadix) + '"' + " in radix " + outRadix);
    }

    public static boolean isValid(String inStr, int radix) {
        for (int i = 0; i < inStr.length(); i++) {
            if (Character.digit(inStr.charAt(i), radix) == -1) {
                return false;
            }
        }
        return true;
    }

    public static String toRadix(String in, int inRadix, int outRadix) {
        // kiem tra chuoi dau vao hop le
        if (!isValid(in, inRadix)) {
            return "";
        }
        int decNum = Integer.parseInt(in, inRadix);
        return Integer.toUnsignedString(decNum, outRadix);
    }
}
