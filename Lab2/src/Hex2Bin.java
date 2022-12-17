import java.util.Scanner;

public class Hex2Bin {
    public static void main(String[] args) {
        final String[] HEX_BITS = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
        Scanner in = new Scanner(System.in);
        String hexStr = in.next().toLowerCase();
        StringBuilder binStr = new StringBuilder();
        for (int i = 0; i < hexStr.length(); i++) {
            char ch = hexStr.charAt(i);
            if ('0' <= ch && ch <= '9') {

                binStr.append(HEX_BITS[Integer.parseInt(ch + "")] + " ");

            } else {
                binStr.append(HEX_BITS[(int) (ch - 87)] + " ");
            }
        }
        System.out.println(binStr);
    }
}
