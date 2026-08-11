package WorkingWithNumbers;

import java.util.Scanner;

public class Q52_DigitOccurrence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String number = sc.next();

        System.out.print("Enter a digit: ");
        char digit = sc.next().charAt(0);

        int count = 0;

        for (int i = 0; i < number.length(); i++) {

            if (number.charAt(i) == digit)
                count++;
        }

        System.out.println("Occurrence = " + count);

        sc.close();
    }
}