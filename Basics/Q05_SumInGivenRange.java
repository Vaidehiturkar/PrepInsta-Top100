package Basics;

import java.util.Scanner;

public class Q05_SumInGivenRange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int start = sc.nextInt();

        System.out.print("Enter second number: ");
        int end = sc.nextInt();

        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum = sum + i;
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }
}