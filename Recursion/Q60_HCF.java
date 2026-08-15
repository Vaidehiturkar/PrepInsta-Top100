package Recursion;

import java.util.Scanner;

public class Q60_HCF {

    static int hcf(int a, int b) {

        if (b == 0)
            return a;

        return hcf(b, a % b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int result = hcf(a, b);

        System.out.println("HCF of " + a + " and " + b + " is " + result);

        sc.close();
    }
}