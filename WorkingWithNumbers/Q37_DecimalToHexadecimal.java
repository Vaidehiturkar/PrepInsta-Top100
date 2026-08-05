package WorkingWithNumbers;

import java.util.Scanner;

public class Q37_DecimalToHexadecimal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        char[] hex = new char[20];
        int i = 0;

        while (decimal > 0) {

            int rem = decimal % 16;

            if (rem < 10)
                hex[i] = (char) (rem + '0');
            else
                hex[i] = (char) (rem - 10 + 'A');

            i++;

            decimal = decimal / 16;
        }

        System.out.print("Hexadecimal number: ");

        for (int j = i - 1; j >= 0; j--) {
            System.out.print(hex[j]);
        }

        sc.close();
    }
}