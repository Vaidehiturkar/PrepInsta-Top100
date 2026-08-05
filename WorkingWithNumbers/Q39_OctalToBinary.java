package WorkingWithNumbers;

import java.util.Scanner;

public class Q39_OctalToBinary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an octal number: ");
        int octal = sc.nextInt();

        int decimal = 0;
        int base = 1;

        while (octal > 0) {

            int rem = octal % 10;

            decimal = decimal + rem * base;

            base = base * 8;

            octal = octal / 10;
        }

        int binary = 0;
        int place = 1;

        while (decimal > 0) {

            int rem = decimal % 2;

            binary = binary + rem * place;

            place = place * 10;

            decimal = decimal / 2;
        }

        System.out.println("Binary number: " + binary);

        sc.close();
    }
}