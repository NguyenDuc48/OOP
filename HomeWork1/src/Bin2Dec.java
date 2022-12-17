import java.util.Scanner;

// chuyen tu nhi phan sang thap phan
public class Bin2Dec {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Binary string: ");
        String inStr = sc.next();
        convertBinToDecimal(inStr);
    }

    public static void convertBinToDecimal(String inStr) {
        int result = 0;
        boolean check = true;
        for (int charIdx = inStr.length() - 1; charIdx >= 0; charIdx--) {
            char inChar = inStr.charAt(charIdx);
            if (inChar == '1') {
                result += (int) Math.pow(2, inStr.length() - charIdx - 1);
            } else if (inChar == '0') {
                result += 0;
            } else if (inChar != 0 || inChar != 1) {
                check = false;
                break;
            }
        }
        // kiem tra va in
        if (check) {
            System.out.println("The equivalent decimal number for binary " + inStr + " is " + result);
        } else {
            System.out.println("Error: invalid binary string " + inStr);
        }
    }

}