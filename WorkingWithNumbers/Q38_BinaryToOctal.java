package WorkingWithNumbers;

import java.util.Scanner;

public class Q38_BinaryToOctal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        int binary = sc.nextInt();

        int decimal = 0;
        int base = 1;

        while (binary > 0) {

            int rem = binary % 10;

            decimal = decimal + rem * base;

            base = base * 2;

            binary = binary / 10;
        }

        int octal = 0;
        int place = 1;

        while (decimal > 0) {

            int rem = decimal % 8;

            octal = octal + rem * place;

            place = place * 10;

            decimal = decimal / 8;
        }

        System.out.println("Octal number: " + octal);

        sc.close();
    }
}