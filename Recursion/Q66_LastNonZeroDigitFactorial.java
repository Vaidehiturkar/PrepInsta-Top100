package Recursion;

import java.util.Scanner;

public class Q66_LastNonZeroDigitFactorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        while (factorial % 10 == 0) {
            factorial = factorial / 10;
        }

        System.out.println("Last non-zero digit = " + factorial % 10);

        sc.close();
    }
}