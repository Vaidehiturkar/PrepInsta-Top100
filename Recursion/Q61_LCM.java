package Recursion;

import java.util.Scanner;

public class Q61_LCM {

    static int hcf(int a, int b) {

        while (b != 0) {

            int rem = a % b;

            a = b;
            b = rem;
        }

        return a;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int gcd = hcf(num1, num2);

        int lcm = (num1 * num2) / gcd;

        System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcm);

        sc.close();
    }
}