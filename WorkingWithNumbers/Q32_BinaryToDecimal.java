package WorkingWithNumbers;

import java.util.Scanner;

public class Q32_BinaryToDecimal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = sc.next();

        int decimal = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {

            if (binary.charAt(i) == '1') {
                decimal = decimal + (1 << power);
            }

            power++;
        }

        System.out.println("Decimal = " + decimal);

        sc.close();
    }
}