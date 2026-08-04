package WorkingWithNumbers;

import java.util.Scanner;

public class Q34_HexadecimalToDecimal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hexadecimal number: ");
        String hex = sc.next().toUpperCase();

        int decimal = 0;

        for (int i = 0; i < hex.length(); i++) {

            char ch = hex.charAt(i);
            int digit;

            if (ch >= '0' && ch <= '9') {
                digit = ch - '0';
            } else {
                digit = ch - 'A' + 10;
            }

            decimal = decimal * 16 + digit;
        }

        System.out.println("Decimal Number = " + decimal);

        sc.close();
    }
}