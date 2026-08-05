package WorkingWithNumbers;

import java.util.Scanner;

public class Q38_BinaryToOctal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        int binary = sc.nextInt();

        int decimal = 0;
        int power = 0;

        while (binary > 0) {

            int rem = binary % 10;

            decimal = decimal + rem * (int) Math.pow(2, power);

            power++;

            binary = binary / 10;
        }

        int[] octal = new int[20];
        int i = 0;

        while (decimal > 0) {

            int rem = decimal % 8;

            octal[i] = rem;

            i++;

            decimal = decimal / 8;
        }

        System.out.print("Octal number: ");

        for (int j = i - 1; j >= 0; j--) {
            System.out.print(octal[j]);
        }

        sc.close();
    }
}