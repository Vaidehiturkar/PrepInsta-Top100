package Recursion;

import java.util.Scanner;

public class Q66_LastNonZeroDigitFactorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = 1;

        for (int i = 1; i <= n; i++) {

            result = result * i;

            while (result % 10 == 0) {
                result = result / 10;
            }

            result = result % 100000;
        }

        System.out.println("Last non-zero digit = " + result % 10);

        sc.close();
    }
}