import java.util.Scanner;

// kiem tra tu doc nguoc va doc xuoi van ra ket qua giong nhau
public class TestPalindromicPhrase {

    public static void main(String[] args) {
        String inStr;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Word or Phrase: ");
        inStr = sc.nextLine();

        if (test(inStr)) {
            System.out.printf("\"%s\" is a palindrome", inStr);
        } else {
            System.out.printf("\"%s\" is not a palindrome", inStr);
        }
    }

    public static boolean test(String inStr) {
        inStr = inStr.toLowerCase();
        inStr = inStr.trim(); // loai bo cac khoang trang
        inStr = inStr.replaceAll("[^a-z]", ""); // loai bo cac dau cau

        // su dung 2 bien dem
        int l2r = 0; // tu trai sang phai
        int r2l = inStr.length() - 1; // tu phai sang trai
        while (l2r < r2l) {
            char forwardChar = inStr.charAt(l2r);
            char backwarChar = inStr.charAt(r2l);
            if (forwardChar != backwarChar) {
                return false;
            }
            l2r++;
            r2l--;
        }
        return true;
    }
}