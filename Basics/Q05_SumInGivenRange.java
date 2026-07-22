package Basics;

import java.util.Scanner;

public class Q05_SumInGivenRange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int start = sc.nextInt();

        System.out.print("Enter second number: ");
        int end = sc.nextInt();

        int sum = (end * (end + 1)) / 2 - ((start - 1) * start) / 2;

        System.out.println("Sum = " + sum);

        sc.close();
    }
}