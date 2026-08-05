package WorkingWithNumbers;

import java.util.Scanner;

public class Q39_OctalToBinary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an octal number: ");
        int octal = sc.nextInt();

        int decimal = 0;
        int power = 0;

        while (octal > 0) {

            int rem = octal % 10;

            decimal = decimal + rem * (int) Math.pow(8, power);

            power++;

            octal = octal / 10;
        }

        int[] binary = new int[20];
        int i = 0;

        while (decimal > 0) {

            int rem = decimal % 2;

            binary[i] = rem;

            i++;

            decimal = decimal / 2;
        }

        System.out.print("Binary number: ");

        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binary[j]);
        }

        sc.close();
    }
}