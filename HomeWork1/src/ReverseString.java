import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inStr = sc.next();
        String newStr = "";
        for (int charIdx = inStr.length() - 1; charIdx >= 0; charIdx--) {
            newStr += inStr.charAt(charIdx);
        }
        System.out.println("The reverse of the String " + '"' + inStr + '"' + " is " + '"' + newStr + '"');

    }
}
