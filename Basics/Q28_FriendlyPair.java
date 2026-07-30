package Basics;

import java.util.Scanner;

public class Q28_FriendlyPair {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 1; i < num1; i++) {
            if (num1 % i == 0) {
                sum1 = sum1 + i;
            }
        }

        for (int i = 1; i < num2; i++) {
            if (num2 % i == 0) {
                sum2 = sum2 + i;
            }
        }

        if ((double) sum1 / num1 == (double) sum2 / num2)
            System.out.println("Friendly Pair");
        else
            System.out.println("Not a Friendly Pair");

        sc.close();
    }
}