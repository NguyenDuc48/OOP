import java.util.Scanner;

public class WordGuess {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String inStr = args[0];
        guessWord(inStr);
    }

    public static void guessWord(String inStr) {
        String guess;
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < inStr.length(); i++) {
            temp.append("_");
        }
        String newStr = temp.toString();
        int count = 0;
        while (1 == 1) {
            System.out.print("Key in one character or your guess word: ");
            guess = sc.next();
            count++;
            if (guess.length() == 1) {
                newStr = replaceStr(temp, inStr, guess);
                if (newStr.equals(inStr)) {
                    System.out.println("Congratulation!");
                    System.out.println("You got in " + count + " trials");
                    break;
                }
            } else if (guess.equals(inStr)) {
                System.out.println("Congratulation!");
                System.out.println("You got in " + count + " trials");
                break;

            }
            System.out.println("Trial " + count + ": " + newStr);

        }
    }

    public static String replaceStr(StringBuilder strBuilder, String inStr, String testStr) {

        for (int i = 0; i < inStr.length(); i++) {
            if (testStr.equals(inStr.charAt(i) + "")) {
                strBuilder.replace(i, i + 1, testStr);
            }
        }
        return strBuilder.toString();
    }
}
