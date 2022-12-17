import java.util.Scanner;


public class CountVowelsDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inStr = sc.next().toLowerCase();
        // khoi tao bien dem va bien tinh ti le
        int vowels = 0;
        double percentsOfVowels;
        int digits = 0;
        double percentsOfDigits;
        int inStrLen = inStr.length();
        for (int charIdx = inStrLen - 1; charIdx >= 0; --charIdx) {
            char c = inStr.charAt(charIdx);    // lay ra ki tu o vi tri charIdx
            if (c == 'a' || c == 'u' || c == 'o' || c == 'i' || c == 'e') {
                vowels++;
            } else if (c >= '0' && c <= '9') {
                digits++;
            }
        }
        percentsOfVowels = (double) vowels / inStrLen * 100.0;
        double percentsOfVowels1 = (double) Math.round(percentsOfVowels * 100) / 100;
        percentsOfDigits = (double) digits / inStrLen * 100.0;
        double percentsOfDigits1 = (double) Math.round(percentsOfDigits * 100) / 100;
        System.out.println("Number of vowels: " + vowels + " " + "(" + percentsOfVowels1 + "%)");
        System.out.println("Number of digits: " + digits + " " + "(" + percentsOfDigits1 + "%)");
    }

}