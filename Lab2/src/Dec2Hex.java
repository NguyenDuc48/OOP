import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String hexStr = "0123456789ABCDEF";
        String result = "";
        System.out.print("Enter a decimal number: ");
        int decNum = in.nextInt();
        in.close();
        while (decNum != 0) {
            int idx = decNum % 16;
            result = hexStr.charAt(idx) + result;
            decNum /= 16;
        }
        if (result.length() == 0) {
            System.out.println("The equivalent hexadecimal number is 0");
        } else {
            System.out.println("The equivalent hexadecimal number is " + result);
        }

    }
}
