package Recursion;

import java.util.Scanner;

public class Q64_FNthTerm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int result = 0;
        int number = 1;

        for (int i = 1; i <= n; i++) {

            int product = 1;

            for (int j = 1; j <= i; j++) {

                product = product * number;
                number++;
            }

            result = result + product;
        }

        System.out.println("F(" + n + ") = " + result);

        sc.close();
    }
}