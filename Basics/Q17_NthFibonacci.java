package Basics;

import java.util.Scanner;

public class Q17_NthFibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Nth Fibonacci term = 0");
            return;
        }

        int first = 0;
        int second = 1;

        for (int i = 2; i <= n; i++) {
            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println("Nth Fibonacci term = " + second);

        sc.close();
    }
}