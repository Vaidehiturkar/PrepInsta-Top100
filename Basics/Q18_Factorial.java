package Basics;

import java.util.Scanner;

public class Q18_Factorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        long fact = 1;

        while (n > 1) {
            fact = fact * n;
            n--;
        }

        System.out.println("Factorial = " + fact);

        sc.close();
    }
}