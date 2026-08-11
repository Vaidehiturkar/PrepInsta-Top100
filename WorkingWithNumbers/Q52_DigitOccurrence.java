package WorkingWithNumbers;

import java.util.Scanner;

public class Q52_DigitOccurrence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.print("Enter a digit: ");
        int digit = sc.nextInt();

        int count = 0;

        while (number > 0) {

            int rem = number % 10;

            if (rem == digit)
                count++;

            number = number / 10;
        }

        System.out.println("Occurrence = " + count);

        sc.close();
    }
}