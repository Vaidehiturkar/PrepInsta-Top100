package WorkingWithNumbers;

import java.util.Scanner;

public class Q33_OctalToDecimal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an octal number: ");
        String octal = sc.next();

        int decimal = 0;
        int power = 0;

        for (int i = octal.length() - 1; i >= 0; i--) {

            int digit = octal.charAt(i) - '0';

            decimal = decimal + (digit * (1 << (3 * power)));

            power++;
        }

        System.out.println("Decimal = " + decimal);

        sc.close();
    }
}