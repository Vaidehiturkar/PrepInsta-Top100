package WorkingWithNumbers;

import java.util.Scanner;

public class Q34_HexadecimalToDecimal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hexadecimal number: ");
        String hex = sc.next().toUpperCase();

        int decimal = 0;
        int length = hex.length();

        for (int i = 0; i < length; i++) {

            char ch = hex.charAt(i);
            int digit;

            if (ch >= '0' && ch <= '9') {
                digit = ch - '0';
            } else {
                digit = ch - 'A' + 10;
            }

            int power = 1;

            for (int j = 0; j < length - i - 1; j++) {
                power = power * 16;
            }

            decimal += digit * power;
        }

        System.out.println("Decimal Number = " + decimal);

        sc.close();
    }
}