package Recursion;

import java.util.Scanner;

public class Q60_HCF {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        while (b != 0) {

            int rem = a % b;

            a = b;
            b = rem;
        }

        System.out.println("HCF is " + a);

        sc.close();
    }
}