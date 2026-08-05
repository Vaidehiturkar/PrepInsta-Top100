package WorkingWithNumbers;

import java.util.Scanner;

public class Q35_DecimalToBinary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

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